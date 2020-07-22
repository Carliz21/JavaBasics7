package com.syntax.class24;

public class MainOverload {

	public static void main(String str) {

		System.out.println("I am a main method with String");
	}

	public static void main(String str, int num) {
		System.out.println("I am a main method with two parameters");

	}

	public static void main(String[] args) { // Java will always run this method b/c of signature
		System.out.println("I am a main method with String array");
		main("main", 4);
		main("main");
		
		
	}

}
