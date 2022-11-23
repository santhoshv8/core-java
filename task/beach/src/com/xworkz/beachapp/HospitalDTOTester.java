package com.xworkz.beachapp;

public class HospitalDTOTester {

	public static void main(String[] args) {
		
		HospitalDTO ref = new HospitalDTO();
		ref.setName("Appolo");
		ref.setAddress("Bannerugatta Road");
		System.out.println("Hospital name is "+ref.getName());
		System.out.println("Hospital address is "+ref.getAddress());
	}
}