package com.airport.app;

public class IronBoxTester {
	
	public static void main(String[] args) {
		
		IronBox.brandName = "Philips" ;
		
		IronBox ref = new IronBox("ow123" , "white" ,1200);
		
		System.out.println("Brand Name is "+IronBox.brandName);
		System.out.println(ref.Id + " "+ref.color + " "+ref.price);
		
		IronBox ref1 = new IronBox("ab12" , "Green" , 800);
		

		System.out.println("Brand Name is "+IronBox.brandName);
		System.out.println(ref1.Id + " "+ref1.color + " "+ref1.price);
		
        IronBox ref2 = new IronBox("xyz85" , "Silver" , 1000);

		System.out.println("Brand Name is "+IronBox.brandName);
		System.out.println(ref2.Id + " "+ref2.color + " "+ref2.price);
	    
        IronBox ref3 = new IronBox("agj455" , "pink" ,1250);
		
		System.out.println("Brand Name is "+IronBox.brandName);
		System.out.println(ref3.Id + " "+ref3.color + " "+ref3.price);
		
	}

}
