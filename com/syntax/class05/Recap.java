package com.syntax.class05;

import java.util.Scanner;

public class Recap {
	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);

		//System.out.println(" Please write a long text");

		//String text1 = myScanner.nextLine();
		
		System.out.println(" Please enter Aidana's age (int)!");
		int num = myScanner.nextInt();
		System.out.println(num);
		
		System.out.println(" Please enter Aidana's age (double)!");
		double d = myScanner.nextDouble();
		System.out.println(d);
		
		System.out.println(" Please enter if Aidana is happy (boolean)!");
		boolean b = myScanner.nextBoolean();
		System.out.println(d);
		
		System.out.println(" Please enter Aidana's name!");
		char myChar = myScanner.next().charAt(0);
		System.out.println(myChar);

	}
}
