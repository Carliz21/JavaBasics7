package com.syntax.class15;

public class StringNoTempVariable {

	public static void main(String[] args) {

		// How would you swap 2 strings without a temporary variable?

		String str1 = "Hello";
		String str2 = "Hi";
		System.out.println("Before swapping: " + str1);
		System.out.println("Before swapping: " + str2 );

		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("After swapping: " + str1);
		System.out.println("After swapping: " + str2);

	}

}
