package com.xworkz.beachapp;

public class HotelDTOTester {

	public static void main(String[] args) {
		
		HotelDTO ref = new HotelDTO();
		ref.setName("Meghanas Food");
		ref.setGstNo("ACNU15561354SS35");
		System.out.println("Hotel name is "+ref.getName());
		System.out.println("Hotel gst no is "+ref.getGstNo());
	}
}