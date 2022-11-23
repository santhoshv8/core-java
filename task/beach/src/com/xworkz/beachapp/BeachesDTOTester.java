package com.xworkz.beachapp;

public class BeachesDTOTester {

	public static void main(String[] args) {
		
		BeachesDTO ref = new BeachesDTO();
		ref.setId(1234);
		ref.setName("Baga");
		System.out.println("Beach Id is "+ref.getId());
		System.out.println("Beach name is "+ref.getName()); 
		

	}
}