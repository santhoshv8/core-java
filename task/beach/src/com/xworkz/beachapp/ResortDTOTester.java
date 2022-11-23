package com.xworkz.beachapp;

public class ResortDTOTester {

	public static void main(String[] args) {
		
		ResortDTO ref = new ResortDTO();
		ref.setName("Vander Mountain vally");
		ref.setPlace("Sandur");
		System.out.println("Resort name is "+ref.getName());
		System.out.println("Resort address is "+ref.getPlace());
	}
}