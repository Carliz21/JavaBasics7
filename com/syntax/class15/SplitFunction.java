package com.syntax.class15;

public class SplitFunction {

	public static void main(String[] args) {

		String str = "Today is Sunday and we have a Java class";

		String[] array = str.split(" ");
		int howManyElements = array.length;
		System.out.println(howManyElements);

		// enhance for loop

		for (String s : array) {
			System.out.println(s + " ");

		}

	}

}
