/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;

/**
 *
 * @author suchi
 */
class User {
    private int DoctorID;
    private String DoctorName,DoctorEmail,DoctorPassword,DoctorContact,Specialist,DoctorGender,DoctorAddress;
    
    public User(int DoctorID,String DoctorName,String DoctorEmail,String DoctorPassword,String DoctorContact,String Specialist,String DoctorGender,String DoctorAddress)
    {
        this.DoctorID=DoctorID;
        this.DoctorName=DoctorName;
        this.DoctorEmail=DoctorEmail;
        this.DoctorPassword=DoctorPassword;
        this.DoctorContact=DoctorContact;
        this.Specialist=Specialist;
        this.DoctorGender=DoctorGender;
        this.DoctorAddress=DoctorAddress;

    }
    public int getDoctorID(){
        return DoctorID;
    }
     public String getDoctorName(){
        return DoctorName;
    }
      public String getDoctorEmail(){
        return DoctorEmail;
    }
       public String getDoctorPassword(){
        return DoctorPassword;
    }
        public String getDoctorContact(){
        return DoctorContact;
    }
    public String getSpecialist(){
        return Specialist;
    }
    public String getDoctorGender(){
        return DoctorGender;
    }
     public String getDoctorAddress(){
        return DoctorAddress;
    }
}
