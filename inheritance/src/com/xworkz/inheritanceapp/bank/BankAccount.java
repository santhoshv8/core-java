package com.xworkz.inheritanceapp.bank;

public class BankAccount {

		//name , ifscCode , branchName ,accountNo
		String name ;
		String ifscCode ;
		String branchName ;
		long accountNo ;
		
		//private key word is used to achive Encapsulation
		private double balance ;
		
		//balance=5000
		public double deposit(double balance) {
			System.out.println("deposite an amount is done: " +balance);
			//0.0+5000
			//value compare with instance variable
			this.balance = this.balance + balance ;
			return this.balance ;
		}
		
		
		public double withDraw(double balance) {
		
			System.out.println("amount to be withdrawed: " + balance);
			this.balance = this.balance - balance ;
			return this.balance ;
		}
		
		public void transfer(double money , BankAccount fc) {
			
			System.out.println("Transfering to another : ");
			withDraw(money);
			fc.deposit(money);
			System.out.println("Trandfering Done . . . . ");
		}
		public void setBalance(double balance) {
			
			this.balance = balance ;
		}
		public double getBalance() {
			return this.balance ;
		}
}