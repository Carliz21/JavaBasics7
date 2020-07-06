package com.syntax.class14;

public class StringMethodsMore {

	public static void main(String[] args) {

		System.out.println("------------.charArt() method---------------------------------");
        // Checks for the specified index-->returns value as a char
		String season = "Summer";

		char character = season.charAt(1);
		System.out.println(character);
		
		System.out.println("------------.indexOf() method---------------------------------");	
		// gives you the index of specified char --> returns value as an int
		int index=season.indexOf('S'); 
		System.out.println(index);
		
		System.out.println("------------.substring() method---------------------------------");	
		
		String message="You guys are awesome";
	    String newMessage=message.substring(4); // take string from index 4
	    System.out.println(newMessage);
	    
	   String middleWord=message.substring(4,8); // taking out one word-->guys
	   System.out.println(middleWord);
		

	}

}
