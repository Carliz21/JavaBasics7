package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your full name!");
		String name =input.nextLine();
		System.out.println("Your name is" + name);
		
		System.out.println("Please enter your age as double");
		double albanianAge =input.nextDouble();
		System.out.println("Your name is" + name + " and age is " + albanianAge);
		
		// Scanner myScanner = new Scanner(System.in);
		// String line = myScanner.nextLine();--> Use this one <--
		// String word = myScanner.next();
		// int num = myScanner.nextInt();
		// double d = myScanner.nextDouble();
		// boolean b = myScanner.nextBoolean();
		// char myChar = myScanner.next().charArt();
		
		
		 
		
	
		
	}

}
