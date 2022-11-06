package com.airport.app;

public class IronBox {

	public IronBox() {
		
	}
	static public String brandName ;
	 public String Id ;
	 public String color;
	 public int price ;
	 
	 public IronBox(String irId , String col , int pri ) {
		 
		 System.out.println("IronBox Constructor");
		 Id = irId ;
		 color = col;
		 price =pri;
	 }
	 
	 public void toTakeUse() {
		 
		 System.out.println("IronBox is Electronics Device");
	 }
	 
	 
	 
	
}
