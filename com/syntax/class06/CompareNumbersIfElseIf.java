package com.syntax.class06;

import java.util.Scanner;

public class CompareNumbersIfElseIf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the first number:");
		double a = scan.nextDouble();

		System.out.println("Please enter the second number:");
		double b = scan.nextDouble();

		System.out.println("Please enter the third number");
		double c = scan.nextDouble();

		double largest;
// First way-----------
//		if (a > b && a > c) {
//			largest = a;
//		} else if (b > a && b > c) {
//			largest = b;
//		} else if (c > a && c > b) {
//			largest = c;
//		}

		// Second way is best way and compiler will not complain

		if (a > b && a > c) {
			// a is the largest
			largest = a;
		} else if (b > c) { // a is not the largest , I am comparing b and c
			largest = b;
		} else { // a is not the largest , b is not the largest 
			// c is the largest 
			largest = c;
		}

		System.out.println("Largest number is " + largest);
	}

}
