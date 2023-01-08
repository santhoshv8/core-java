package com.xworkz.list.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
 
public class CompanySoftware {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("TCS", "java");
		map.put("oracle", "database");
		map.put("Amezom", "AWS");
		map.put("Microsoft", "windows");
		map.put("Apple", "IOS");
		map.put("Infosis", "java");
		map.put("Capgemeny", "database");
		map.put("Cognizent", "AWS");
		map.put("Etranbiz", "windows");
		map.put("wipro", "IOS");
		
       System.out.println(map.size());
		
		System.out.println("=====keys=====");
		
		Set<String> keys = map.keySet();
		keys.forEach(k -> System.out.println(k));
		
		System.out.println("====values======");
		
		Collection<String> value = map.values();
		value.forEach(v -> System.out.println(v));
		
		System.out.println("Loap as a pair");
		Set<Entry<String, String>> entries = map.entrySet();
		for (Entry<String, String> entry : entries) {
			System.out.println(entry.getKey()+" "+entry.getValue()); 
	    }
    }
}