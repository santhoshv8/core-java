package com.xworkz.examapp.hallticket;

public class HallTicket {

   private String candidateName ;
   private String subjectNames[] ;
   private String usnNo ;
   private String universityName ;
   
   public HallTicket(String candidateName , String[] subjectNames , String usnNo , String universityName) {
	   
	   System.out.println("HallTicket Object is Created ");
	   this.candidateName = candidateName ;
	   this.subjectNames = subjectNames ;
	   this.usnNo = usnNo ;
	   this.universityName = universityName ;
	}
   
   public void displayDetails(){
	 //to invoke current class members use this.
	   System.out.println("candidate Name : "+this.candidateName);
	   System.out.println("university Name is : "+this.universityName);
	   System.out.println("U S N is : "+this.usnNo);
	   System.out.println("List of subjects exam to be given by the candidate ");
	   
	   for(int i = 0 ; i<subjectNames.length ; i++) {
		   System.out.println(subjectNames[i]);
	   }
   }
}