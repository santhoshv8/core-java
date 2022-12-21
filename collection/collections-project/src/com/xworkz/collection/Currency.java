package com.xworkz.collection;

import java.util.Collection;
import java.util.TreeSet;

public class Currency {

	public static void main(String[] args) {
		
		String name1 = "Indian Rupee" ;
		String name2 = "USD";
		String name3 = "Euro";
		String name4 = "Australian Dollar";
		String name5 = "Danish Krone";
        String name6 = "GBP";
		String name7 = "Canadian Doller";
		String name8 = "Czech Koruna";
		String name9 = "Japanese Yen";
		String name10 = "Bulgarian Lev";
		String name11 = "Bahraini Dinar";
		String name12 = "Chilean peso";
		String name13 = "Colombian Peso";
		String name14 = "Egyptian Pound";
		String name15 = "Boliviano";
		String name16 = "Albanian Lek";
		String name17 = "Brunei Doller";
		String name18 = "Jordanian Dinar";
		String name19 = "Argentine Peso";
		String name20 = "New zealandollar";
		String name21 = "Cape Verdean Escudo";
		String name22 = "Bahamian Dollar";
		String name23 = "Bhutanese Ngultrum";
		String name24 = "Dominican Peso";
		String name25 = "Algerian Dinar";
		String name26 = "Swiss franc";

		Collection<String> collection = new TreeSet<String>();
		collection.add(name1);
		collection.add(name2);
		collection.add(name3);
		collection.add(name4);
		collection.add(name5);
		collection.add(name6);
		collection.add(name7);
		collection.add(name8);
		collection.add(name9);
		collection.add(name10);
		collection.add(name11);
		collection.add(name12);
		collection.add(name13);
		collection.add(name14);
		collection.add(name15);
		collection.add(name16);
		collection.add(name17);
		collection.add(name18);
		collection.add(name19);
		collection.add(name20);
		collection.add(name21);
		collection.add(name22);
		collection.add(name23);
		collection.add(name24);
		collection.add(name25);
		collection.add(name26);

		System.out.println("---------------");
		System.out.println(collection);
		System.out.println("size "+collection.size());
		collection.clear(); 
		System.out.println("---------------");
		System.out.println(collection);
		
 
	}
}
