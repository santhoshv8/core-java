package com.xworkz.overloading.conceptoverloading;

public class Carrom {

	public String brand ;
	public String material ;
	public String color ;
	public String coinsName[] = new String [4] ;
	
	public Carrom() {
		System.out.println("Default Constructor is called");
	}
	public Carrom(String coinsName[]) {
		this("Generic" , "wood" , "Woodcolor");
		this.coinsName = coinsName ;
		System.out.println("One Parametrized Constructor is called");
	}
	public Carrom(String brand , String matrial , String color) {
		this();
		System.out.println("Three Parameterized Constructor is called");
		this.brand = brand ;
		this.material = matrial;
		this.color = color ;
	}
	public void displayDetailes() {
		System.out.println("displayDetails() is invoked");
		System.out.println(this.brand + " " + this.material + " " +this.color);
		System.out.println("List Of coins in  "+ this.brand);
		for(int i = 0 ; i < coinsName.length ; i ++) {
			System.out.println(coinsName[i]);
	}
		
	}
}
