package com.xworkz.beachapp;

public class EcommerceDTOTester {

	public static void main(String[] args) {
		
		EcommerceDTO ref = new EcommerceDTO();
		ref.setName("Amazon");
		ref.setProduct("Oppo mobile");
		System.out.println("Ecommerce Name is "+ref.getName());
		System.out.println("Ecommerce product is "+ref.getProduct());
	} 
}
