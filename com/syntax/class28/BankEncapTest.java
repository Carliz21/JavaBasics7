package com.syntax.class28;

public class BankEncapTest {
	
	public static void main(String[] args) {
		
		BankEncap bank = new BankEncap();
		bank.setAccountNumber(123456789);
		System.out.println(bank.getAccountNumber());
		
		
		bank.setBalance(1000);
		System.out.println(bank.getBalance());
		
	}

}
