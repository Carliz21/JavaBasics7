package com.repl.excercises;

public class Repl99 {

	public static void main(String[] args) {

		String word = "oozy RAT in a sanitary ZOO";
		String reverse = "";
		reverse.equalsIgnoreCase(word);
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse+= word.charAt(i);

		}
		if (word.equals(reverse)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
