package com.repl.excercises;

import java.util.Scanner;

public class ReplVowels {

	public static void main(String[] args) {
		
	

		Scanner inp = new Scanner(System.in);
	    System.out.println("In");
	    String word = inp.nextLine();
	    String replace=word.replaceAll("[^aAeEiIoOuU]", "");
	    System.out.println(replace);		
		
		
	}

}
