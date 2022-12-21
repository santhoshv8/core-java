package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Bikes {

	public static void main(String[] args) {
		
		Collection<String> collection = new ArrayList<String>();
		collection.add("Royal Enfield gun metal gray");
		collection.add("Pulser 220F");
		collection.add("Ns 200");		
		collection.add("Rs 200");
		collection.add("Honda CBZ");
		collection.add("Himalyan");
		collection.add("passion pro");
		collection.add("spender+");
		collection.add("kawasaki");
		collection.add("BMW");
		collection.add("FZ");
		collection.add("MT");
		collection.add("Meteor");
		collection.add("Intercepter");
		collection.add("Continental GT");
		collection.add("Bullet");
		collection.add("Honda Shine");
		collection.add("passion plus");
		 
		System.out.println("---------------");
		System.out.println(collection);
		System.out.println("size "+collection.size());
		collection.clear(); 
		System.out.println("---------------");
		System.out.println(collection);
		
	}
}
