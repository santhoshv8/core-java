package com.xworkz.taskapp.tasks;

public class Google extends SearchEngine{

	public void website() {
		System.out.println("Google is the best website to search");
	}
	public static void main(String[] args) {
		
		Google ref = new Google();
		ref.search();
		ref.website();
	}
}
//5