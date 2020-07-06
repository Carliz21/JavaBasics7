package com.repl.excercises;

public class Repl97 {
	
	public static void main(String[] args) {
		
		//Create a String given="Hello Syntax friends". 
		//Using String methods from given String create new String "Welcome Syntax family"
		
		String sentence= "Hello Syntax friends";
		sentence=sentence.replace("Hello", "Welcome").replace("friends", "family");
		System.out.println(sentence);

		
		
		
		
	}

}
