package com.xworkz.taskapp.tasks;

public class Chiken extends NonVeg{

	public void food() {
		System.out.println("A food rich in protein, chicken can help with weight management and reduce the risk of heart disease");
	}
	public static void main(String[] args) {

    Chiken ref = new Chiken();
    ref.health();
    ref.food();

	}

}
//27