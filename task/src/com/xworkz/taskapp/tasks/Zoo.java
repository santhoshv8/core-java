package com.xworkz.taskapp.tasks;

public class Zoo extends WildLifeSanctuary{

	public void animal()
	{
		System.out.println("zoo is a area where animals are kept for public exhibition");
	}
	public static void main(String[] args) {
		Zoo w = new Zoo();
		w.wild();
		w.animal();
	}
}
//14