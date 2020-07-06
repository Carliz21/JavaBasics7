package com.syntax.class15;

public class Task3 {

	public static void main(String[] args) {
		
		/* Create a String a= "Is it saturday? Is it raining? Do we have a Java class today?"
		 * Find out how many sentences are in String
		 */

		String a = "Is it saturday? Is it raining ? Do we have a Java class today?";

		String[] array = a.split("[?]");
		int howManySentences = array.length;
		System.out.println(howManySentences);

	}

}
