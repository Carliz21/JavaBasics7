package com.bucky.practice;

public class UdemyNested {

	public static void main(String[] args) {

		// and -->&&

		int num = 20;

		if (num > 15 && num < 25) {
			System.out.println(num + " is greater than 15 and less than 25 ");
		}

		// or -->||
		// ie if a num is either 20 0r 25

		int num1 = 20;

		if (num1 == 20 || num1 == 25) {
			System.out.println("num is either 20 or 25");
		}

		// nested if statement
		// user enters a number 0

		int num2 = 15;

		if (num2 != 0) {
			if (num2 > 18) {
				System.out.println("age is greater than 18");
			} else {
				System.out.println("age is 18 or less");
			}

		}

	}

}
