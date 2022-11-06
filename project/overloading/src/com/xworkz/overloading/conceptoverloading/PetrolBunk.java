package com.xworkz.overloading.conceptoverloading;

public class PetrolBunk {

		//instance variables/ states / properties / fields
		public int id ;
		public String name ;
		public String location ;
		public String workersName[] = new String [7] ;
		
		//Default Constructor
		public PetrolBunk() {
			  System.out.println("Default Constructor is called");
		}
		public PetrolBunk(String workersName[]) {
			this(123 , "DeveGouda Petrol Bunk" , "Banashankari 2nd stage" , workersName);
			System.out.println("one parameterized constructor is called");
		}
		// parameterized Constructor
		public PetrolBunk(int id , String name , String location , String[] workersName)
		{
			// below statement is used for constructor chaining
		   this(); // this method as a 1st statement
		   System.out.println("calling 4 parametrized Constructor");	
		   this.id = id ;
		   this.name = name ;
		   this.location = location ;
		   this.workersName = workersName ;
		}

		public void providefuel() {

		}
		public void displayDetails() {
			System.out.println("displayDetails() is invoked");
			System.out.println(this.id + " " + this.name + " " +this.location);
			System.out.println("List Of Workers in  "+ this.name);
			for(int i = 0 ; i < workersName.length ; i ++) {
				System.out.println(workersName[i]);
			}
		}
}