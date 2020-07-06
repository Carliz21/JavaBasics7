package com.syntax.class14;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("What is Mom's first name");
		String mom = input.nextLine();

		System.out.println("What is Dad's first name");
		String dad = input.nextLine();

		System.out.println("Is it a boy or girl?");

		String gender = input.nextLine();

		String babyName;

		if (gender.toLowerCase().equals("boy")) {
			System.out.println("Congratulations, it's a boy!!");
			babyName = dad.substring(0, dad.length() / 2) + mom.substring(mom.length() / 2);

		} else if (gender.equalsIgnoreCase("girl")) {
			System.out.println("Congratulations, it's a girl!!");
			babyName = mom.substring(0, mom.length() / 2) + dad.substring(dad.length() / 2);

		} else {
			babyName = "unknown";
		}

		System.out.println(babyName.toUpperCase());
		input.close();

		String day = "Sunday";

		char letter = day.toUpperCase().charAt(1);

		int lengthOfNewDay = day.substring(3).toUpperCase().length();
		System.out.println(lengthOfNewDay);

	}

}
