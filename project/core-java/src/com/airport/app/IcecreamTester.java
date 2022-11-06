package com.airport.app;

public class IcecreamTester {

	
		 public static void main(String[] args) {
			 
			 
			 Icecream i=new Icecream("Arun", 123,"Mango",50);
			 System.out.println(i.brandname + i.price + i.flavour + i.quantity);
			 
			 
			 Icecream i1=new Icecream ("Amul", 120, "Chocolate",167);
			 System.out.println(i1.brandname + i1.price + i1.flavour + i1.quantity);

			 Icecream i2=new Icecream ("Anil",134,"Vanilla",120);
		     System.out.println(i2.brandname + i2.price + i2.flavour + i2.quantity);
		     
		     Icecream i3=new Icecream ("Akash",124,"Pineapple",10);
		     System.out.println(i3.brandname + i3.price + i3.flavour + i3.quantity);
		     
		     Icecream i4=new Icecream ("Amit",174,"Apple",30);
		     System.out.println(i4.brandname + i4.price + i4.flavour + i4.quantity); 
			 
		 }
			 
	}


