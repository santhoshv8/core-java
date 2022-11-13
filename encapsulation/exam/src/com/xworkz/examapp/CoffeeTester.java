package com.xworkz.examapp;

import com.xworkz.examapp.coffeepowder.CoffeePowder;
import com.xworkz.examapp.coffeeshop.CoffeeShop;

public class CoffeeTester {

	public static void main(String[] args) {
		
		CoffeePowder powder = new CoffeePowder("BRU" , "Present");
		
		CoffeeShop shop = new CoffeeShop();
		shop.price = 100 ;
		     boolean isConnected = shop.filter(powder);
		     System.out.println("filter is done : "+isConnected);

	}

}
