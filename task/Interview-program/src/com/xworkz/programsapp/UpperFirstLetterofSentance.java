package com.xworkz.programsapp;

public class UpperFirstLetterofSentance {

	public static void main(String[] args) {
		
		String str = "java is a programming language";
		
		String word [] = str.split("\\s");
		
		String newStr = " ";
		 
		for (String ws : word) {
			
			String fStr = ws.substring(0,1);
			String sStr = ws.substring(1);
			
			newStr+= fStr.toUpperCase()+sStr +" ";
		}
		System.out.println(newStr);
	}
}
