package com.syntax.class15;

public class Palindrome {

	public static void main(String[] args) {

		// How would you check if String is palindrome or not?

		String word = "Mom";
		String reverse = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse += word.charAt(i);
			System.out.println(reverse);

		}
		if (reverse.equalsIgnoreCase(word)) {
			System.out.println("It is a Palindrome");
		}else {
			System.out.println("It it Not a Palindrome");
		}

	}

}
