package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Animals {

	public static void main(String[] args) {
		
		String name1 = "Lion";
		String name2 = "Tiger";
        String name3 = "Elephant";
		String name4 = "Dear";
		String name5 = "Dog";
		String name6 = "Cat";
		String name7 = "Cow";
		String name8 = "Rabbit";
		String name9 = "Fox";
		String name10 = "Monkey";
		
		Collection<String> animal = new ArrayList<String>();
		animal.add(name1);
		animal.add(name2);
		animal.add(name3);
		animal.add(name4);
		animal.add(name5);
		animal.add(name6);
		animal.add(name7);
		animal.add(name8);
		animal.add(name9);
		animal.add(name10);
		
		System.out.println("=====foreach=====");
		for(String element : animal) {
			System.out.println(element);
		}
		
		System.out.println("=====Iterator=====");
		Iterator<String> itr = animal.iterator();
		while(itr.hasNext()) {
			String ele = itr.next();
			System.out.println(ele); 
		}
		System.out.println("==============");
        System.out.println("size "+animal.size()); 
	}
}
