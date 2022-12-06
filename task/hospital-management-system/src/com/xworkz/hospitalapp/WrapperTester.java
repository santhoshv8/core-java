package com.xworkz.hospitalapp;

import java.util.Scanner;

public class WrapperTester {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Age");
		Integer age = scanner.nextInt();
		System.out.println(age);
		scanner.close();
		/*
		int age = 89 ;
		//Boxing
		Integer age1 = age ;
		//un-boxing
		int age2 = age1;
		*/
		
		long number = 9876543210L ;
		Long number1 = number ;
		long number2 = number1 ;
		
		byte b = 64 ;
		Byte b1 = b ;
		byte b2 = b1 ;
		
		short s =100 ;
		Short s1 = s ;
		short s2 = s1 ;
		
		float f = 152.00f ;
		Float f1 = f ;
		float f2 = f1 ;
		
		double d = 145.58 ;
		Double d1 = d ;
		double d2 = d1 ;
		
		boolean isEmergency = true ;
		Boolean isEmergency1 = isEmergency ;
		boolean isEmergency2 = isEmergency1 ;
		
		char c = 'S';
		Character c1 = c ;
		char c2 = c1 ;
		 
		System.out.println(age);
    	System.out.println(number);
    	System.out.println(b);
    	System.out.println(s);
    	System.out.println(f);
    	System.out.println(d);
    	System.out.println(isEmergency);
    	System.out.println(c);
	}
}