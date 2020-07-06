package com.syntax.class12;

public class InterviewQuestion3 {

	public static void main(String[] args) {

		// Write a Java Program to print the first 10 numbers of Fibonacci series.

		int a, b, c;
		a=1;
		b=1;
	
		
		System.out.print("The first ten numbers of the Fibonacci series are :" + " ");

		for (int i = 1; i <= 10; i++) {

			System.out.print(a + " ");
			c=a + b;
			a=b;
			b=c;

			
		}

	}

}
