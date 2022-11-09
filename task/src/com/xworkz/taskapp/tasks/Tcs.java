package com.xworkz.taskapp.tasks;

public class Tcs extends Company {
   
	public String name = "T C S" ;
	
	public void name() {
		System.out.println("TCS");
	}
	public static void main(String[]args) {
		
		Company ref = new Company();
		ref.work();
		Tcs ref1 = new Tcs();
		ref1.name();
	}
}
//22