package com.xworkz.inheritanceapp.bank;

public class BankTester {

	public static void main(String[] args) {

		BankAccount amount = new BankAccount();
		amount.deposit(10000);
		System.out.println("balance: "+amount.getBalance());
		
		amount.withDraw(2000);
		System.out.println("balance: " +amount.getBalance());
		
		BankAccount fc = new BankAccount();
	    fc.deposit(1000);
	    System.out.println("friends account balance is: "+fc.getBalance());
	    
	    amount.transfer(500.00, fc);
	    System.out.println("amount is: "+fc.getBalance());
	    
	    fc.transfer(500, fc);
	    System.out.println("My account balance is : "+amount.getBalance());
	    
	    System.out.println("friend account balance is: " +fc.getBalance());
	    
	    SavingsAccount savings = new SavingsAccount(0.7);
	  //  savings.interestRate = 0.7 ;
	    savings.deposit(1000);
	    savings.periodicInterest();
	    System.out.println(savings.getBalance());
	}

}