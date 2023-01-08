package com.xworkz.list.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PgNameFees {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Tirumala PG", 6000);
		map.put("sai pg", 4500);
		map.put("kaveri pg", 7000);
		map.put("ragavendra pg", 5500);
		map.put("sam pg", 6000);
		map.put("sachin pg", 7500);
		map.put("amrutha pg", 8000);
		map.put("shubham pg", 7000);
		map.put("Kushi pg", 6000);
		map.put("narayana pg", 6500);
		
		System.out.println(map.size());
		
		System.out.println("======keys======");
		
		Set<String> key = map.keySet();
		key.forEach(k -> System.out.println(k));
		
		System.out.println("======value======");
		
		Collection<Integer> value = map.values();
		value.forEach(v -> System.out.println(v)); 
		
		System.out.println("Loop as a pair");
		
		Set<Entry<String, Integer>> entries = map.entrySet();
		for (Entry<String, Integer> entry : entries) {
			
			System.out.println(entry.getKey()+" "+ entry.getValue()); 
		}
	}
}
