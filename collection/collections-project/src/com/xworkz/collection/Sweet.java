package com.xworkz.collection;

import java.util.Collection;
import java.util.TreeSet;

public class Sweet {

	
	public static void main(String[] args) {
		
		String ref1 = "rasgulla" ;
		String ref2 = "Rabri";
		String ref3 = "Kaju";
		String ref4= "Ladoo";
		String ref5 = "Barfi";
		String ref6 = "Mysure Pak";
		String ref7 = "Rasmalai";
		String ref8 = "Peda";
		String ref9 = "Modak";
		String ref10 = "Halwa";
		String ref11 = "Sona Papadi";
		String ref12 = "Gulab Jamun";
		String ref13 = "Jalebi";

		
		Collection<String> collection = new TreeSet<String>();
		collection.add(ref1);
		collection.add(ref2);
		collection.add(ref3);
		collection.add(ref4);
		collection.add(ref5);
		collection.add(ref6);
		collection.add(ref7);
		collection.add(ref8);
		collection.add(ref9);
		collection.add(ref10);
		collection.add(ref11);
		collection.add(ref12);
		collection.add(ref13); 

		System.out.println("---------------"); 
		System.out.println(collection);
		System.out.println("size "+collection.size());
		collection.clear(); 
		System.out.println("---------------");
		System.out.println(collection);
		
	}	
}
