package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection; 
import java.util.Iterator;

public class Watch {

	public static void main(String[] args) {
		
		String name1 = "Fire Boult";
		String name2 = "Casio" ;
		String name3 = "I watch" ;
		String name4 = "Fast Rack";
		String name5 = "Sonata";
		
		Collection<String> watch = new 	ArrayList<String>();
		watch.add(name1);
		watch.add(name2);
		watch.add(name3);
		watch.add(name4);
		watch.add(name5);
		
		System.out.println("=====foreach=====");
		for(String element : watch) {
			System.out.println(element); 
		}
		
		System.out.println("=====Iterator======");
		Iterator<String> itr = watch.iterator();
		//Using methods without knowing impl
		while(itr.hasNext()) {
			String ele = itr.next();
			System.out.println(ele); 
		}
		System.out.println("===============");
		System.out.println("size "+watch.size()); 
	}
}
 