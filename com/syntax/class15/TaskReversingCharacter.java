package com.syntax.class15;

public class TaskReversingCharacter {

	public static void main(String[] args) {

		// How would you reverse a String character by character?


		String word = "Reversing";

		for (int i = word.length() - 1; i >= 0; i--) {

			char reverse = word.charAt(i);

			System.out.print(reverse);

		}

		System.out.println();
	}

}
