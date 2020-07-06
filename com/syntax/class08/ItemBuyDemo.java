package com.syntax.class08;

import java.util.Scanner;

public class ItemBuyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		double money;
		double totalAmount=0;
		double remainingBalance;
		double change;
		System.out.println("Please tell me what item would you like to purchase?");
		String item = input.nextLine();

		System.out.println("Please enter cost of the item");
		double price = input.nextDouble();

		do {
			System.out.println("Please give payment!");
			money=input.nextDouble();
			totalAmount += money;
			
			if(totalAmount < price) {
				remainingBalance=price-totalAmount;
				System.out.println("Your remaining balance is " + remainingBalance);
			} else if(totalAmount >price) {
				change=totalAmount-price;
				System.out.println("Your change is " + change);
			} else {
				System.out.println("Thank you for the exact amount");
			}
			
		} while (totalAmount < price);
		System.out.println("Thank you for shopping!");

	}

}
