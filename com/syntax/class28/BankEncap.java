package com.syntax.class28;

public class BankEncap {

	private long accountNumber;
	private double balance;
	
	//setter
	
	public void setAccountNumber(long accountNumber) {
		//here we can validation points
		this.accountNumber=accountNumber;
		
	}
	
	public void setBalance(double balance) {
		//here we can validation points
		this.balance=balance;
		
		}

	// getter
	public long getAccountNumber() {
		//here we can validation points
		return accountNumber;
	}
	
	public double getBalance() {
		//here we can validation points
		return balance;
	}
	


}
