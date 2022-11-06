package com.airport.app;

public class WatchTester {

	public static void main(String[] args) {
		Watch w=new Watch(123,100,"Boat","Pink","Chain");
		System.out.println(w.id + w.price +w.name + w.color +w.type);
		
		
		
		System.out.println("--------------------------------------");
		Watch w1=new Watch(166,12345,"Fastrack","Black","Belt");
		System.out.println(w1.id + w1.price +w1.name + w1.color +w1.type);
	

		System.out.println("--------------------------------------");
		Watch w2=new Watch(166,12345,"Omega","Cream","Leather");
		System.out.println(w2.id + w2.price +w2.name + w2.color +w2.type);
		
		System.out.println("--------------------------------------");
		Watch w3=new Watch(166,12345,"Rolex","brown","bracklet");
		System.out.println(w3.id + w3.price +w3.name + w3.color +w3.type);
		
		System.out.println("--------------------------------------");
		Watch w4=new Watch(166,12345,"Jagwar","purpule","strap");
		System.out.println(w4.id + w4.price +w4.name + w4.color +w4.type);
		
		
		
	}
}
