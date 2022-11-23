package com.xworkz.beachapp.coffeeshop;

public class CoffeeShopDTOTester {

	public static void main(String[] args) {
		
		CoffeeShopDTO ref = new CoffeeShopDTO();
		ref.setName("tea time");
		ref.setAddress("ballari");
		System.out.println("CoffeeShop name is "+ref.getName());
		System.out.println("CoffeeShop address is "+ref.getAddress());
	} 
}