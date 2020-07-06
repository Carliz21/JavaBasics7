package com.syntax.class08;

import java.util.Scanner;

public class BuyItem {
	public static void main(String[] args) {
		/*
		 * Write a program to ask a user to enter item they want to buy and the price of
		 * that item. Every time user enters money accumulate the amount and tell the
		 * user how much is left to payoff. If user gives more money program should
		 * return a change. Whenever a user done with payments program should say
		 * "Thank you for shopping!"
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Please tell me what item would you like to purchase?");
		String item = input.nextLine();

		System.out.println("Please enter cost of the item");
		double price = input.nextDouble();

		System.out.println("Please insert cash");
		double payment = input.nextDouble();

		while (payment < price) {
			System.out.println("Your balance is " + (price-payment));
			double moreMoney=input.nextDouble();
			payment += moreMoney;		
		}
		 if (payment == price) {
			 System.out.println("Thank you for shopping!");
		 } else {
			 System.out.println("Your change is  " + (payment- price) + " Thank you for shopping!");
		 }
			

	}

}
