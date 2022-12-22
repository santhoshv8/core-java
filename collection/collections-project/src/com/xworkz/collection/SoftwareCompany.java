package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftwareCompany {

	public static void main(String[] args) {
		
		String name1 = "TCS";
		String name2 = "Mindtree";
		String name3 = "HCL";
		String name4 = "Amazon";
		String name5 = "Capgemini";
		String name6 = "E tran Biz";
		String name7 = "Infosys";
		String name8 = "Tech Mahindra";
		String name9 = "Wipro";
		String name10 = "Accenture";
		String name11 = "IBM";
		String name12 = "Oracle";
		String name13 = "Cognizant";
		String name14 = "Cisco";
		String name15 = "Dell";
		String name16 = "HP";
		String name17 = "SAP";
		String name18 = "Samsung";
		String name19 = "Bosch";
		String name20 = "Intel";
		
		Collection<String> sowtware = new ArrayList<String>();
		sowtware.add(name1);
		sowtware.add(name2);
		sowtware.add(name3);
		sowtware.add(name4);
		sowtware.add(name5);
		sowtware.add(name6);
		sowtware.add(name7);
		sowtware.add(name8);
		sowtware.add(name9);
		sowtware.add(name10);
		sowtware.add(name11);
		sowtware.add(name12);
		sowtware.add(name13);
		sowtware.add(name14);
		sowtware.add(name15);
		sowtware.add(name16);
		sowtware.add(name17);
		sowtware.add(name18);
		sowtware.add(name19);
		sowtware.add(name20);
		
		System.out.println("=======foreach=======");
		for (String ref : sowtware) {
			System.out.println(ref);
		}
		
		System.out.println("======Iterator========");
		Iterator<String> itr = sowtware.iterator();
		while(itr.hasNext()) {
			String ref1 = itr.next();
			System.out.println(ref1);
		}

		System.out.println("============");
		System.out.println("size "+sowtware.size()); 
	}
}
