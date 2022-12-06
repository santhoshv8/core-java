package com.xworkz.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

public class HospitalTester {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in) ;
		
		Patient patient = new Patient();
		
	    System.out.println("Enter the patient Name"); 
	    patient.setPatientName( scanner.next());
	
	    System.out.println("Enter the patient Address");
	    patient.setAddress( scanner.next()); ;
	
	    System.out.println("Enter the patient age"); 
	    patient.setAge( scanner.nextInt());
	
	    System.out.println("Enter the patient gender"); 
	    patient.setGender(Gender.valueOf(scanner.next())); 
		
         //	Patient patient = new Patient("mangappa" , "bengalore" , Gender.male , 89);
			Hospital hospital = new Hospital();
			hospital.isEmergency = true ;
			hospital.isTreatmentRequired = true ;
		   // hospital.admit(patient);
			boolean isEmergency =  hospital.admit(patient);
				System.out.println("patient can be allowed "+isEmergency);
				
			scanner.close();//return type is void 
	} 
}