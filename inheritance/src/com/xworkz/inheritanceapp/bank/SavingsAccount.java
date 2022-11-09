package com.xworkz.inheritanceapp.bank;

public class SavingsAccount extends BankAccount {
	
	public String name ;
	public double interestRate ;
	
	public SavingsAccount() {
		super();
		System.out.println("SavingsAccount Object is created");
	}
	public SavingsAccount(double interestRate) {
		super();
		System.out.println("SavingsAccount Object is created");
		this.interestRate = interestRate ;
	}
	//SavingsAccount specific method
	public void periodicInterest() {
		
		double newBalance = super.getBalance() * interestRate/100 ;
		deposit(newBalance);	
	}
}