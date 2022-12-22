package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoeSize {

	public static void main(String[] args) {
		
		int size1 = 1;
		int size2 = 2;
		int size3 = 3;
		int size4 = 4;
		int size5 = 5;
		int size6 = 6;
		int size7 = 7;
		int size8 = 8;
		int size9 = 9;
		int size10 = 10;
		int size11 = 11;
		int size12 = 12;
		int size13 = 13;
		int size14 = 14;
		int size15 = 15;
		
		Collection<Integer> shoe = new ArrayList<Integer>();
		shoe.add(size1);
		shoe.add(size2);
		shoe.add(size3);
		shoe.add(size4);
		shoe.add(size5);
		shoe.add(size6);
		shoe.add(size7);
		shoe.add(size8);
		shoe.add(size9);
		shoe.add(size10);
		shoe.add(size11);
		shoe.add(size12);
		shoe.add(size13);
		shoe.add(size14);
		shoe.add(size15);
		
		System.out.println("=====foreach======");
		for (int integer : shoe) {
			System.out.println(integer);
		}
		
		System.out.println("======Iterator======");
		Iterator<Integer> ref = shoe.iterator();
		while (ref.hasNext()) {
			int ele = ref.next();
			System.out.println(ele);
		}
		
		System.out.println("============");
		System.out.println("size "+shoe.size()); 
 	}
}
