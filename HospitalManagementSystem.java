/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HospitalManagementSystem{

    public static Connection connectDB(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                            "jdbc:sqlserver://localhost:1433;databaseName=HospitalManagement;selectMethod=cursor", "sa", "123456");
            System.out.println("DATABASE NAME IS:"+ connection.getMetaData().getDatabaseProductName());
            return connection;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    } 
     public static void main(String[] args) {
       HospitalManagementSystem cnObj = new HospitalManagementSystem();  
        cnObj.connectDB();
    }
    
}
