package com.repl.excercises;

public class Repl92 {

	public static void main(String[] args) {

		// Validate if the string ends with "u" prints the boolean value accordingly.
		// Validate if the string ends with "world" prints the boolean value
		// accordingly.
		// Validate if the string ends with "are" prints the boolean value accordingly.
		// Validate if the string ends with "you" prints the boolean value accordingly.

		String s1 = "hello how are you";
		boolean ends = s1.endsWith("u");
		System.out.println(ends);

		boolean endsWithWorld = s1.endsWith("world");
		System.out.println(endsWithWorld);

		boolean endsWithAre = s1.endsWith("are");
		System.out.println(endsWithAre);

		boolean endsWithYou = s1.endsWith("you");
		System.out.println(endsWithYou);
		
		
		System.out.println("------------------------or----------------------------");
		
		System.out.println(s1.endsWith("u"));
		System.out.println(s1.endsWith("world"));
		System.out.println(s1.endsWith("are"));
		System.out.println(s1.endsWith("you"));

	}

}
