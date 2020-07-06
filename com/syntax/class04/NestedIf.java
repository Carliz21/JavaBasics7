package com.syntax.class04;

public class NestedIf {
	public static void main(String[] args) {
		// Nested if = if condition inside an if
		// if (boolean expression {
		// code....
		// if (another boolean expression) {
		// code..
		// else {
		// inner else code...

		boolean isMorning = true;
		boolean isSchool = false;
		int time = 20;

		if (isMorning) {
			System.out.println("Good morning");
			if (isSchool) {
				System.out.println(" Friends");
			} else {
				System.out.println("Family");
			}

			System.out.println("Bye");
		} else {
			System.out.println(" It is not morning");
		}

		if (time < 18) {
			System.out.println("Good afternoon");
		} else {
			System.out.println("Good evening");
		}

		System.out.println("Has no questions");

	}
}
