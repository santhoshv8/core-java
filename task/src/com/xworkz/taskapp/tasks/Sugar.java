package com.xworkz.taskapp.tasks;

public class Sugar extends Sweet {

	public void sweet() {
		System.out.println("Sweet is have more sugar");
	}
	public static void main(String[] args) {
	
		Sugar ref = new Sugar();
		ref.sell();
		ref.sweet();
	}

}
//26