package com.repl.excercises;

public class Repl102 {

	public static void main(String[] args) {
		// Write a for loop that will loop through every character of a word and print
		// out each character each on a separate line

		String day = "Hello";

		String[] array = day.split("");

		for (String s : array) {
			System.out.println(s + "  ");
		}

		String day2 = "Sunday";

		for (int i = 0; i <= day2.length() - 1; i++) {
			System.out.print(day2.charAt(i)+ " ");

		}

	}
}