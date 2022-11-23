package com.xworkz.beachapp;

public class BankDTOTester {

	public static void main(String[] args) {
		
		BankDTO ref = new BankDTO();
		ref.setName("S B I");
	 	ref.setBranch("B T M Layout");
		System.out.println("Bank name is "+ref.getName());
		System.out.println("Bank branch is "+ref.getBranch());
	}
}