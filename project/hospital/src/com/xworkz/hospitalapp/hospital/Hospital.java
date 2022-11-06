package com.xworkz.hospitalapp.hospital;

public class Hospital {
       // datatype variableNames[] ={value};
	   
	   // datatype variableNames[10];
	
	 String patientNames[] = new String[6];
	 int index;
	 
	 
	 public boolean savePatientNames(String patientName) {
		
		 
		 System.out.println("inside savePatientNames ");
		if(patientName !=null && patientNames.length >index) { 
			 //patientName[0]= "" ;
			 patientNames[index++] = patientName;
			 return true;
		}
		else {
			System.out.println("patient name is full ... Bed illa");
		}
		System.out.println("end of savePatientNames");
	    
		return false;
	 }
		public void getPatientNames() {
			     System.out.println("List of all the patient");
			for(int i =0; i<patientNames.length  ; i++) {
			      System.out.println(patientNames[i]);
		}
		 
	 }
	public boolean updatePatientNames(String oldPatientName , String newPatientName) {
		
		  System.out.println("inside updatePatientNames");
		  for(int i=0 ; i<patientNames.length; i++) {
			  
			  if(patientNames[i] == oldPatientName) {

				  patientNames[i] = newPatientName ;
				  return true ;
		  }
	}
    return false ;     
}
}



