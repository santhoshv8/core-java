package com.xworkz.interview;

public class InterviewTester {

	public static void reverse(String data) {
		//converts the String to a new CharArray 
		char newData[] = data.toCharArray();	
		
		for(int index = 0 ; index < newData.length ; index++) {
			System.out.print(newData[index] + " ");
	    }
		for(int index = newData.length-1 ; index >=0 ; index--) {
			System.out.print(newData[index] + " ");
		}
	}
	public static void main(String[] args) {

        reverse("Santhosh ");
	}
}
//convert first character to uppercase("my name is santhosh")
//reverseMiddlewords{"My Name is Santhosh");