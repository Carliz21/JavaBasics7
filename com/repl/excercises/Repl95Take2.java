package com.repl.excercises;

import java.util.Scanner;

public class Repl95Take2 {
	
	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please type a word");
		String word=scan.nextLine();
		String newWord=word.substring(0, 3);
		System.out.println(newWord);
		
		
		
	}
	
	
	

}
