package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCityName {

	public static void main(String[] args) {
		
		String name1 = "Bengalore";
		String name2 = "Hydrabad";
		String name3 = "Mumbai";
		String name4 = "Delhi";
		String name5 = "Chanai";
		
		Collection<String> metro = new ArrayList<String>();
		metro.add(name1);
		metro.add(name2);
		metro.add(name3);
		metro.add(name4);
		metro.add(name5);
		
		System.out.println("=====foreach======");
		for (String name : metro) {
			System.out.println(name);
		}
		
		System.out.println("====Iterator======");
		Iterator<String> names = metro.iterator();
		while (names.hasNext()) {
			String ref = names.next();
			System.out.println(ref); 
		}
		
		System.out.println("============");
		System.out.println("size "+metro.size()); 
	}
}
