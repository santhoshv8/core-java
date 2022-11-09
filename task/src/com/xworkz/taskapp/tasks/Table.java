package com.xworkz.taskapp.tasks;

public class Table extends Wood {

	public void wood() {
		System.out.println("Table is made of wood");
	}
	public static void main(String[] args) {
	
		Table ref = new Table();
		ref.product();
		ref.wood();

	}

}
//28