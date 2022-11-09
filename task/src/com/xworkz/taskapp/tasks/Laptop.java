package com.xworkz.taskapp.tasks;

public class Laptop extends ElectronicDevice{

	public void towork() {
		System.out.println("Laptop is a electronic devices");
	}
	public static void main(String[] args) {
		
    Laptop ref = new Laptop();
    ref.Device();
    ref.towork();
	}
}
//2