package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

public class HospitalTester {

	public static void main(String[] args) {
	
		Patient patient = new Patient("Arun" , "Hospate" , Gender.male , 23);
		Hospital hospital = new Hospital();
		hospital.isEmergency = true ;
		hospital.isTreatmentRequired = true ;
		boolean isEmergency =  hospital.admit(patient);
			System.out.println("patient can be allowed "+isEmergency);
	}
} 