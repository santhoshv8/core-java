package com.airport.app;

public class EmployeeTester {

	  public static void main (String [] args) {
		  // static memebers can be shared among multiple objects
	     Employee.companyName = "Amezon" ; 
	     Employee.companyAddress = "Mahendrs Tech Park" ; 
		  
		  Employee emp = new Employee("AWS123" , "Shivu M" , "B+");
		  // static memebers can not be shared among multiple objects
		 
		  System.out.println("Employee Details");
		  System.out.println(emp.employeeId + " " + emp.name + " " + emp.bloodGroup);
		  System.out.println("employee Comapany Name is " + Employee.companyName);
		  System.out.println("employee Address is " + Employee.companyAddress);
		  
		  Employee emp1 = new Employee("AWS124" , "Akash" , "AB+");
		
		  System.out.println("Employee Details");
		  System.out.println(emp1.employeeId + " " + emp1.name + " " + emp1.bloodGroup);
		  System.out.println("employee Comapany Name is " + Employee.companyName);
		  System.out.println("employee Address is " +Employee.companyAddress);
	  }
}
 //watch --- id , color , price , brandName (static)
//FootWear --- id , color , price , model
//IronBox --- id , name , type
//IceCream 
//SoftDrinks --- id , name price , flavor , quantity