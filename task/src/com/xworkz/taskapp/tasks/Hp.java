package com.xworkz.taskapp.tasks;

public class Hp extends PetrolBunk {

	public void name() {
		System.out.println("HP is a good petrol bunk in india");
	}
	public static void main(String[] args) {
	
    Hp ref = new Hp();
    ref.place();
    ref.name();
	}
}
//18