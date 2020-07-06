package com.syntax.class16;

public class Task1 {

	// 1.Create a method that will take 2 parameters as a numbers and prints which
	// number is larger.

	void larger(int a, int b) {
		if (a > b) {
			System.out.println("The larger number is: " + a);
		} else {
			System.out.println("The larger number is: " + b);
		}
	}

	// 2.Create a method that will take a number and prints whether the number is
	// even or odd.
	void oddEven(int a) {
		if (a % 2 == 0) {
			System.out.println(a + ":is even");
		} else {
			System.out.println(a + ":is odd");

		}

	}

	// 3. Create a method that will print whether give String is palindrome or not.

	void palindrome(String word) {
		String b = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			b += word.charAt(i);
		}
		if (b.equals(word)) {
			System.out.println(word + " is palindrome");
		} else {
			System.out.println(word + " isn't palindrome");
		}
	}

	// 4.Create a method that will say Hello in different language based on the
	// country that will passed when method is executed.

	void sayHello(String country) {
		if (country.equalsIgnoreCase("USA")) {
			System.out.println("We say Hello");
		} else if (country.equalsIgnoreCase("Mexico")) {
			System.out.println("We say Hola");
		} else if (country.equalsIgnoreCase("France")) {
			System.out.println("We say Bonjour");
		} else {
			System.out.println("I don't know how to say it");
		}

	}

}
