package com.xworkz.list.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ChocalatePrice {

	public static void main(String[] args) {
		
		Map<String, Double> map =new HashMap<String, Double>();
		map.put("Fereero Rochar", 895.50);
		map.put("Kit Kat", 35.00);
		map.put("Milky Bar", 10.00);
		map.put("Dairy Milk", 85.25);
		map.put("Eclirse", 2.00);
		map.put("Snikers", 45.00);
		map.put("Bounty", 60.25);
		map.put("silk oreo", 150.25);
		map.put("Mars", 20.00);
		map.put("Bournville", 125.00);
		
		System.out.println(map.size());
		
		System.out.println("=====keys=====");
		
		Set<String> keys = map.keySet();
		keys.forEach(k -> System.out.println(k));
		
		System.out.println("====values======");
		
		Collection<Double> value = map.values();
		value.forEach(v -> System.out.println(v));
		
		System.out.println("Loap as a pair");
		Set<Entry<String, Double>> entries = map.entrySet();
		for (Entry<String, Double> entry : entries) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
