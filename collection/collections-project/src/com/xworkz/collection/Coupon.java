package com.xworkz.collection;

import java.util.Collection;
import java.util.TreeSet;

public class Coupon {

	public static void main(String[] args) {
		
		Collection<String> collection = new TreeSet<String>();
		collection.add("WELCOME10");
		collection.add("GDAY10");
		collection.add("HELLO10");
		collection.add("HOWDY10");
		collection.add("WELCOMEABOARD");
		collection.add("ALLABOARD");
		collection.add("SHIPITFREE");
		collection.add("FREESHIP");
		collection.add("TAKEITALL");
		collection.add("SPOOKY15");
		collection.add("BIGTREAT");
		collection.add("PUMPKIN");

		System.out.println("---------------");
		System.out.println(collection);
		System.out.println("size "+collection.size());
		collection.clear(); 
		System.out.println("---------------");
		System.out.println(collection);
		

	}
}
