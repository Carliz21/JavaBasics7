package com.syntax.class06;

import java.util.Scanner;

public class CompareNumbersUsingNestedIf {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the first number:");
		double a = scan.nextDouble();

		System.out.println("Please enter the second number:");
		double b = scan.nextDouble();

		System.out.println("Please enter the third number");
		double c = scan.nextDouble();

		double largest;

		if (a > b) {
			// here a is larger than b
			if (a > c) {
				// a is the largest
				largest = a;
			} else {
				// a is larger than b, but not larger than c
				largest = c;
			}
		} else {
			if (b > c) {
				// b is the largest
				largest = b;
			} else {
				// b is larger than a , but c is larger than c
				largest = c;
			}
		}

		System.out.println("Largest number is " + largest);

	}

}
