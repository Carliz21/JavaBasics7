package com.syntax.class08;

import java.util.Scanner;

public class RangeIntegers {
	public static void main(String[] args) {
		/* 
		 * Write a program that reads a range of integers (start and end point), 
		 * provided by a user and then from that range prints the sum of the even 
		 * and odd integers.
		 *
		 */
		
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter a start number?");
		int start=input.nextInt();
		
		System.out.println("Please enter an end number?");
		int end=input.nextInt();
		
		int sumEven=0; // we need to initialize the #s because we do not the value of variable
		int sumOdd=0;
		int total=0;
		for (int i=start; i<=end; i++) {
		
			if(i%2==1) {
				sumOdd+=i;
			} else {
				sumEven+=i;
			}
			 
		}
		
		System.out.println("Sum of even numbers is " + sumEven);
		System.out.println("Sum of odd numbers is " + sumOdd);
		total=sumEven+sumOdd;
		System.out.println("Sum of all numbers is " + total);
		
	}

}
