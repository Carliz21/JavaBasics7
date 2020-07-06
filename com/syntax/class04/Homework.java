package com.syntax.class04;

public class Homework {
	public static void main(String[] args) {
		int num = 90;
		if (num > 0) {
			System.out.println(" Number is positive!");
		} else if (num < 0) {
			System.out.println(" Number is negative !");
		} else {
			System.out.println(" Number is zero!");
		}
		
		System.out.println("****************");
		
		// Task odd or even 
		
        int num2 = 67;
        int remainder = num2 % 2;
        
        if (remainder == 0) {
        	System.out.println(num2 + " is even!");
        } else {
        	System.out.println(num2 + " is odd!");
        }
		
		
	}

}
