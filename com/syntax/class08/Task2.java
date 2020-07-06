package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.println("Would you like to apply for a credit card?");
			String answer = input.next();

			if (answer.equals("yes")) {
				System.out.println("Great.Let's submit the application.");
				break;
			}

		}

	}

}
