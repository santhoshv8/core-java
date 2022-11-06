package com.xworkz.overloading.conceptoverloading;

public class PetrolBunkTester {

	public static void main(String [] args) {
		
		String workersName[] = {"Akash" , "Sumanth" , "Sneha" , "Sushma" , "Navya" , "Sagar" , "Akthar Musthafa"};
		
		PetrolBunk bunk = new PetrolBunk(workersName);
		
		bunk.displayDetails();
	}
}