package com.xworkz.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospitalapp.apollo.ApolloHospitals;
import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.patient.Patient;

public class ApolloHospitalsTester {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Patient Size");
		int size = scanner.nextInt();
		 
		ApolloHospitals apolloHospitals = new ApolloHospitals(size); 
		 
		for (int i = 0; i < size; i++) {
			
		    Patient patient = new Patient();
		
		    System.out.println("Enter the patient Name");
		    patient.setPatientName(scanner.next()); 
		
		    System.out.println("Enter the patient Address");
		    patient.setAddress(scanner.next());  ;
		
		    System.out.println("Enter the patient age");
		    patient.setAge(scanner.nextInt());
		
		    System.out.println("Enter the patient gender"); 
		    patient.setGender(Gender.valueOf(scanner.next())); 
		
		  apolloHospitals.addPatient(patient);
	    }
		apolloHospitals.getAllPatients();
		
//		System.out.println("Enter The Patient Name");
//		String patientName = scanner.next();
//		apolloHospitals.getPatientByName(patientName);
		
//		System.out.println("Enter The Patient Age");
//		int age = scanner.nextInt();
//		apolloHospitals.getPatientByAge(age);
		
//		System.out.println("Enter The Patient address");
//		String address = scanner.next();
//		apolloHospitals.getPatientByAddress(address);
		
//		System.out.println("Enter The Patient Gender"); 
//		apolloHospitals.getPatientByGender(Gender.valueOf(scanner.next()));
		
		System.out.println("Enter The patient name to search patient gender");
		apolloHospitals.getGenderByPatientName(scanner.next()); 
		
	 	scanner.close();
	}
} //grouping the data into single block is called is encapsulation
