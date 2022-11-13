package com.xworkz.examapp.coffeepowder;

public class CoffeePowder {

	private String coffeePowderName ;
	private String water ;
	
	public CoffeePowder(String coffeePowderName ,String water) {
		
		System.out.println("coffee powder object is created");
		this.coffeePowderName = coffeePowderName ;
		this.water = water ;
		
	}
	public void powderDetailes() {
		
		System.out.println("coffeePowder Name is : "+this.coffeePowderName);
		System.out.println("water is : "+this.water);
		
	}
}
