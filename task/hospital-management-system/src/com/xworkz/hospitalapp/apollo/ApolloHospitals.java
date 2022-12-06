package com.xworkz.hospitalapp.apollo;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

public class ApolloHospitals extends Hospital{

	//One To Many Relationship -- has a relationship - composition - association
	public Patient[] patients ;
	int index ;
	 
	public ApolloHospitals(int size) {
		
		patients = new Patient[size];
	} 
	 
	public boolean addPatient(Patient patient) {
		System.out.println("inside addpatient method");
		boolean isPatientAdded = false ;
		if(patient != null) {
			System.out.println("patient's deatails are right ");
			patients[index++] = patient ;
			isPatientAdded = true ;
		//	index++ ;
		}
		return isPatientAdded; 
	}
	
	public void getAllPatients() {
		System.out.println("The List Of Patients");
		for(int i = 0 ; i<patients.length ; i++)
			System.out.println(patients[i].getPatientName() + " "+ patients[i].getAddress() + " " + 
		    patients[i].getAge() + " " + patients[i].getGender() );
		
	}
	
	public void getPatientByName(String patientName) {
		System.out.println("inside getPatientByName");
		System.out.println("No of parameters  : 1 : patientName(String)");
		for (int i = 0; i < patients.length; i++) {
			if (patients[i].getPatientName().equals(patientName)) {

				System.out.println(patients[i].getPatientName() + " "+ patients[i].getAddress() + " " + 
					    patients[i].getAge() + " " + patients[i].getGender() );
			}
			
		}
	}
	
	public void getPatientByAge(int age) {
		System.out.println("inside getPatientByAge");
		System.out.println("No of parameters  : 1 : patientage(int)");
		for (int i = 0; i < patients.length; i++) {
			if (patients[i].getAge() == (age)){

				System.out.println(patients[i].getPatientName() + " "+ patients[i].getAddress() + " " + 
					    patients[i].getAge() + " " + patients[i].getGender() );
			}
			
		}
	}
	
	public void getPatientByAddress(String address) {
		System.out.println("inside getPatientByAddress");
		System.out.println("No of parameters  : 1 : patientName(String)");
		for (int i = 0; i < patients.length; i++) {
			if (patients[i].getAddress().equals(address)) {

				System.out.println(patients[i].getPatientName() + " "+ patients[i].getAddress() + " " + 
					    patients[i].getAge() + " " + patients[i].getGender() );
			}
			
		}
	}
	
	public void getPatientByGender(Gender gender) {
		System.out.println("inside getPatientByGender");
		System.out.println("No of parameters  : 1 : patientName(String)");
		for (int i = 0; i < patients.length; i++) {
			if (patients[i].getGender().equals(gender)) {

				System.out.println(patients[i].getPatientName() + " "+ patients[i].getAddress() + " " + 
					    patients[i].getAge() + " " + patients[i].getGender() );
			}
			
		}
	}
	public void getGenderByPatientName(String patientName) {
		System.out.println("inside getGenderByPatientName");
		System.out.println("No of parameters  : 1 : patientName(String)");
		for (int i = 0; i < patients.length; i++) {
			if (patients[i].getGender().equals(patientName)) {
 
				System.out.println(patients[i].getPatientName() + " "+ patients[i].getAddress() + " " + 
					    patients[i].getAge() + " " + patients[i].getGender() );
			}
			 
		}
	}
}
