package com.syntax.class03;

public class IfCondition {
	
	public static void main(String[] args) {
		//declare a number and compare if the number is larger than 100
		// If it is larger than 100, I will print --> My number is large
		
		int num = 178;
		
		boolean result = num > 100;
		
		System.out.println("Let us check");
		
		if (num > 100) { 
			System.out.println("My number is large");
		}else {
			System.out.println("My number is small");
		}
		
		System.out.println("The check is complete");
		
	// Example 2
		
		int expectedHours = 15;
		int actualHours = 20;
		
		if (actualHours >= expectedHours) {
			System.out.println("You will love and understand Java ");
		}else {
		 System.out.println("You will not love Java");}
		
		// Example 3 
		double budget = 10000;
		double carPrice = 15000;
		
		if (budget > carPrice){ // I will buy if I have more money
			System.out.println("I will buy this car");
			System.out.println("I am happy");
		}else {
			System.out.println("I will not buy this car");
			System.out.println("I will study Java");
		}
		
		// 
		
		
	}

}
