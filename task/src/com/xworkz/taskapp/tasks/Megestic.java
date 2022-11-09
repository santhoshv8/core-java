package com.xworkz.taskapp.tasks;

public class Megestic extends BusStop{

	public void board() {
		System.out.println("Megestic is the place bus stop is there to board");
	}
	public static void main(String[] args) {
	
	Megestic ref = new Megestic();
	ref.travel();
	ref.board();

	}

}
//30