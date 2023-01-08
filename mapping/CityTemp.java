package com.xworkz.list.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CityTemp {

      public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<String, Integer>();
		map.put("Bengalore", 22);
		map.put("Sandur", 28);
		map.put("Ballari", 32);
		map.put("Hospet", 30);
		map.put("ChitaDurga", 31);
		map.put("Mysore", 26);
		map.put("Mangalore", 27);
		map.put("hadagali", 29);
		map.put("Bijapur", 31);
		map.put("Gulbarga", 34);
		
		System.out.println(map.size());
		
		System.out.println("==========keys=========");
		
		Set<String> key = map.keySet();
		key.forEach(k -> System.out.println(k)); 
		
		System.out.println("========values=======");
		
		Collection<Integer> value = map.values();
		value.forEach(v -> System.out.println(v)); 
		
		System.out.println("Loap as a pair");
		
		Set<Entry<String,Integer>>entries = map.entrySet();
		for (Entry<String, Integer> entry : entries) {
			
			System.out.println(entry.getKey()+" "+entry.getValue()); 
		}
	}
}
