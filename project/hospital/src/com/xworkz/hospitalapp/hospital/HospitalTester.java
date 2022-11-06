package com.xworkz.hospitalapp.hospital;

public class HospitalTester {

	public static void main(String[] args) {
		
		Hospital hospital = new Hospital();
		hospital.savePatientNames("Ganesh");
		hospital.savePatientNames("Ganesha");
		hospital.savePatientNames("Ganeshi");
		hospital.savePatientNames("Guna");
		hospital.savePatientNames("Dasappa");
		hospital.savePatientNames("yellamma");
		hospital.savePatientNames("Tiger");
        hospital.getPatientNames();
		

	}

}
