package com.airport.app;

public class Employee {

	static public String companyName ;
	static public String companyAddress ;
	public String employeeId ;
	public String name ;
	public String bloodGroup ;
	
	//default constructor
	public Employee() {
		
	}
	// use of Constructor is to in it the instance variable
	//parametrized constructor
	public Employee(String empId , String nm , String bGroup) {
		
		System.out.println("Employee Object Created");
		
		employeeId = empId ;
		name = nm ;
		bloodGroup = bGroup ;
	}
	
	
	
	public void toHelpOrgToGrow() {
		
		System.out.println("Employee ");
	}
}
