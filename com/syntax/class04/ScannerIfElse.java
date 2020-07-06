package com.syntax.class04;

import java.util.Scanner;

public class ScannerIfElse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number!");
		int num1 =scan.nextInt();
		
		System.out.println("Please enter another amount");
		int num2 =scan.nextInt();
		
		System.out.println("Numbers are " + num1 + " and " + num2);
		
		if (num1>num2 ) {
			System.out.println(num1 + " is a larger than " + num2);
		} else if(num1<num2) {
			System.out.println(num1 + " is smaller than " + num2);
		} else {
			System.out.println(num1 +  " is equal to "  + num2);
		}
		
		
	}

}
