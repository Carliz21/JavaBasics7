package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		// Declare a number 
		// If number is between 1-10 --> number is small
		// If number is between 11-100 --> number is big
		// if number is between 101-1000-->number is large
		
		int num= -53;
		
		if (num >= 1 || num <= 10) { // true && false --> true with OR
			System.out.println(num +  " is small number");
		} else if (num >= 11 && num <= 100) {
			System.out.println(num + " is a big number ");
		} else if (num >= 101 && num <= 1000) {
			System.out.println(num + " is a large number");
		} else {
			System.out.println(num + " is out of range");
		}
		
		
	}
}
