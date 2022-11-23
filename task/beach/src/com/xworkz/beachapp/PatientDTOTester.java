
package com.xworkz.beachapp;

public class PatientDTOTester {

	public static void main(String[] args) {
		
		PatientDTO ref = new PatientDTO();
		ref.setId(12340);
		ref.setName("pavan");
		System.out.println("Patient id is "+ref.getId());
		System.out.println("Patient name is "+ref.getName());
	}
}