package com.xworkz.overloading.conceptoverloading;

public class CarronTester {

	public static void main(String[] args) {
		
		String coinsName[] = {"white coins" , "black coins" , "red coins" , "Striker coin"};
		Carrom ref = new Carrom(coinsName);
		ref.displayDetailes();
	}
}
