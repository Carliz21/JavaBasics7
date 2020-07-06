package com.syntax.class12;

import java.util.Scanner;

public class InterviewQuestion2 {

	public static void main(String[] args) {

		// Write a java program to check whether a given number is prime or not?

		Scanner input = new Scanner(System.in);
		System.out.println("Please think of a number from 1-100");
		int num = input.nextInt();
		int count = 0;

		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				count++;

				break;
			}
		}

		if (count == 0 && num != 1) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
	}

}
