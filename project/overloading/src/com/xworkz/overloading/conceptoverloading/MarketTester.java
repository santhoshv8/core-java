package com.xworkz.overloading.conceptoverloading;

public class MarketTester {

	public static void main(String[] args) {
		
	String vegetables[] = {"Tomato", "Potato" , "Carrot" , "Onion" , "Chilli" , "cucumber"};
	Market ref = new Market(vegetables);
	ref.displayDetailes();
	}
}
