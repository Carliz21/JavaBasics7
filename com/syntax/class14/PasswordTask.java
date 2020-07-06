package com.syntax.class14;

import java.util.Scanner;

public class PasswordTask {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your username");
		String username = scan.nextLine();
		System.out.println("Please enter your password");
		String password = scan.nextLine();

		if (username.isEmpty() || password.isEmpty()) {
			System.out.println("Username or password cannot be empty");

		} else {

			if (password.length() >= 8) {

				if (!password.contains(username)) {

					System.out.println("Please confirm your password");
					String confirmedPassword = scan.nextLine();

					if (password.equals(confirmedPassword)) {
						System.out.println("Your username and password has been created");
					} else {
						System.out.println("Passwords do not match");
					}

				} else {

					System.out.println("Password cannot contain username");

				}

			} else {

				System.out.println("Password is too short");
			}

		}

	}
}
