package com.repl.excercises;

import java.util.Scanner;

public class Repl101 {
	public static void main(String[] args) {

		// name of the scanner
		Scanner scanner = new Scanner(System.in);

		// initialize variable
		String userInput = "";

		// asking to enter a string
		System.out.print("Enter a string: ");

		// read and store user input
		userInput = scanner.next();

		// using For-Loop displaying in console every third character
		for (int i = 0; i < userInput.length(); i += 2) {
			System.out.print(userInput.charAt(i));
		}
	}

}
