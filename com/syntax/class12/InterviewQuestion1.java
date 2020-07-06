package com.syntax.class12;

public class InterviewQuestion1 {
	
	public static void main(String[] args) {
		
		//  Write a program to swap 2 numbers without a temporary variable?
		// int a= 20;
		// int b= 30;
		
	 System.out.println("Before swapping");
	 
	 int a= 20;
	 int b=30;
	 
	 System.out.println("value of x:" + a);
	 System.out.println("value of y:" + b);
	 System.out.println("After swaping");
	
	 a = a + b;
	 b = a - b;
	 a = a - b;
	 
	 System.out.println("value of x:" + a);
	 System.out.println("value of y:" + b);
	}

}
