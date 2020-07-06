package com.syntax.class05;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		// Salary example

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your number of working years!");
		int years = scan.nextInt();
		
		if (years >= 5) {
			System.out.println("You are eligible for bonus!");
			
			System.out.println("Please enter your annual salary!");
			double salary = scan.nextDouble();
			if (salary > 50000) {
				System.out.println("Your bonus will be $5000!");
			} else {
				System.out.println("Your bonus will be $3000!");
			}
		} else {
			System.out.println("You are not eligible for bonus!");
		}

	}

}
