package com.xworkz.hospitalapp.patient;

import com.xworkz.hospitalapp.constant.Gender;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter 
public class Patient {
 
	private String patientName ;
	private String address ;
	//constant 
	private Gender gender ; 
	private int age ;
	
	public Patient() {
		
	}
 
	public Patient(String patientName , String address , Gender gender , Integer age) {
		
		this.patientName = patientName ;
		this.address = address ;
		this.gender = gender ;
		this.age = age ;
	}

	public void displayInfo() {
		
		System.out.println("Patient Name is : "+patientName);
		System.out.println("patient address is : "+address);
		System.out.println("patient gender is "+gender);
		System.out.println("patient age is "+age);
	
	}
}
//it support primitive data type because java is not purely object oriented programming language 
// to make purely object oriented programming language use of Wrapper class
