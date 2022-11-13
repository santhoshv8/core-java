package com.xworkz.examapp.coffeeshop;

import com.xworkz.examapp.coffeepowder.CoffeePowder;

public class CoffeeShop {

	public CoffeePowder coffeePowder ;
	public int price ;
	
	public boolean filter(CoffeePowder coffeePowder) {
		
		boolean isConnected = false ;
		System.out.println("inside filter method");
		System.out.println("The price is : "+this.price);
		if(price >=100) {
			System.out.println("Filter is conected");
			if(coffeePowder != null) {
			this.coffeePowder = coffeePowder ;
			System.out.println("Datails of the coffee is . . . ");
			this.coffeePowder.powderDetailes();
			isConnected = true ;
			System.out.println("coffee powder is present : now filter is working");
		    }
			else {
				System.out.println("coffee powder is not there");
			}
	    }
		else {
			System.out.println("Filter is not working");
		}
		return isConnected ;
	}
}	
/* CoffeeShop
boolean filter(String coffeePowder , String water , boolean isWaterPresent ,boolean isSugarAdded ){
  
  boolean isFiltered = false ;
   check whether filter is connected or not
   check coffeePowder is available or not
   isFiltered = true ;
   
}
*/