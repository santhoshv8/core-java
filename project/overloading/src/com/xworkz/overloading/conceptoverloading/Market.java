package com.xworkz.overloading.conceptoverloading;

public class Market {

	public String name ;
	public String location ;
	public String[] vegetables = new String [6] ;
	
	public Market() {
		System.out.println("Default Constructor is called");
	}
	public Market(String [] vegetables) {
		this("APMC" , "Rajajinagar");
		this.vegetables = vegetables ;
		System.out.println("One Parameterized Constructor is called");
	}
	public 	Market(String name , String location) {
		this();
		System.out.println("Two Parametrized Constructor is called " );
		this.name = name ;
		this.location = location ;
	}
	public void displayDetailes() {
		System.out.println("displayDetailes() is invoked");
		System.out.println(this.name + " " + this.location);
		System.out.println("List Of Vegetables in " + this.name);
		for(int i=0 ; i<vegetables.length; i++) {
			System.out.println(vegetables[i]);
		}
	}
}
