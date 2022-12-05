package com.xworkz.programsapp;

import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		char c[] = str.toCharArray();
		
		for(int i=0 ; i<c.length;i++) {
			if(c[i]!=' ') {
				System.out.println(c[i]);
			}
		}
		sc.close();
	}
}
