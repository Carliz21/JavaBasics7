package com.syntax.class15;

public class Task2 {
	
	public static void main(String[] args) {
		
		// Create a String that should be a combination of letters, numbers and special characters.
		// Find out how many alpha characters are in the String
		
		String sentence= "Hello! My name is Carmen. I am 36 years old!!";
		
		sentence=sentence.replaceAll("[^A-Za-z]","");
		
		System.out.println(sentence.length());
	}

}
