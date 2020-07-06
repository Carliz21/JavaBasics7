package com.repl.excercises;

import java.util.Scanner;

public class Repl98 {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		String givenString = inp.nextLine();
		String reverse = "";
		for (int i = givenString.length() - 1; i >= 0; i--) {
			reverse += givenString.charAt(i);
		}
		boolean palindrome = true;
		for (int i = 0; i < givenString.length(); i++) {
			if (givenString.charAt(i) != reverse.charAt(i)) {
				System.out.println(palindrome);
			} else {
				System.out.println(!palindrome);
			}
		}

	}

}
