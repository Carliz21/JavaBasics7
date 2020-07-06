package com.syntax.class05;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// Credit card example
		Scanner scan = new Scanner(System.in);
		boolean cc;
		System.out.println("Do you have a credit card? (true or false)");
		cc = scan.nextBoolean();
		if (cc) {
			System.out.println("What is your credit card balance?");
			double balance = scan.nextDouble();
			if (balance > 1000) {
				System.out.println("Please pay off immediately!");
			} else {
				System.out.println("You can spend more!");
			}

		} else {
			System.out.println("Do you want to apply for our best Credit Card?");

		}

	}

}
