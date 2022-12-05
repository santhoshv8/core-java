package com.xworkz.interview;

public class LargestAndSmallest {
	
	public static void findLargestAndSmallestNumber(int [] a) {
		
		int smallest = a[0] ;
		int largest = a[0] ;	
		
		for(int index =1 ; index < a.length ; index ++) {
			//a.length = 7 -- 56>34
			if(a[index] > largest){
				largest = a[index] ;
			}
			else if (a[index] < smallest){
				smallest = a[index] ;
			}
		}
		System.out.println("The Largest Number is "+ largest);
		System.out.println("The Smallest Number is "+ smallest);
	}
	
	public static void main(String [] args) {
		
		int a[] =  {34 , 56 , 78 , 88 , 566 , 8};
		findLargestAndSmallestNumber(a);
	}
}