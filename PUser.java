/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;

class PUser {
    private int PatientID;
    private String PatientName,PatientEmail,PatientContact,PatientAge,Symptoms,PatientGender,PatientAddress;
    
    public PUser(int PatientID,String PatientName,String PatientEmail,String PatientContact,String PatientAge,String Symptoms,String PatientGender,String PatientAddress)
    {
        this.PatientID=PatientID;
        this.PatientName=PatientName;
        this.PatientEmail=PatientEmail;
        this.PatientContact=PatientContact;
        this.PatientAge=PatientAge;
        this.Symptoms=Symptoms;
        this.PatientGender=PatientGender;
        this.PatientAddress=PatientAddress;

    }
    public int getPatientID(){
        return PatientID;
    }
     public String getPatientName(){
        return PatientName;
    }
      public String getPatientEmail(){
        return PatientEmail;
    }
       public String getPatientContact(){
        return PatientContact;
    }
        public String getPatientAge(){
        return PatientAge;
    }
    public String getSymptoms(){
        return Symptoms;
    }
    public String getPatientGender(){
        return PatientGender;
    }
     public String getPatientAddress(){
        return PatientAddress;
    }
}
