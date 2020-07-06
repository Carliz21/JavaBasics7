package com.syntax.class15;

public class Task1 {
	
	public static void main(String[] args) {
		
		/*
		 * Create a String that will hold a sentence.
		 * Write a program to get a new String without any spaces.
		 * 
		 */
		
		String sentence=" I will go shopping today";
		
		sentence=sentence.replaceAll("[^A-za-z0-9]", "");
		
		System.out.println(sentence);
		
	}

}
