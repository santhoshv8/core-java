package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;

public class Hospital {

	public Patient patient ;
	public boolean isEmergency ;
	public boolean isTreatmentRequired ;
	
	public boolean admit(Patient patient) {
		boolean isAdmited = false ;
		if(isTreatmentRequired == true) {
		if(isEmergency == true) {
			this.patient = patient ;
			this.patient.displayInfo();
			isAdmited = true ;
			System.out.println("patient can be allowed in I C U");
		}
		else {
			System.out.println("patient can be allowed in general ward");
		}
		}
		else {
			System.out.println("patient can go to home");
		}
		return isAdmited ;
		}
}
