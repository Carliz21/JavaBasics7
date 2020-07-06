package com.syntax.class02;

public class HomeworkPart1 {
	public static void main(String[] args) {
		//Write a Java program to add, subtract, multiply and divide 2 decimal values. 
		//Your program should say. "The _______ of 2 numbers ___ and ___ is equal to _____"
		
		double num1=10.5; 
		double num2=5.5;
		
		double sum = num1 + num2;
		double sub = num1 - num2;
		double mult = num1 * num2;
		double div = num1 / num2;
		
	System.out.println( "The addition of 2 numbers " + num1 + " and " + num2 + " is equal to " + sum + '.'); 
	System.out.println("The subtractin of 2 numbers " + num1 + " and " + num2 + " is equal to " + sub + '.') ;
	System.out.println("The multiplication of 2 numbers " + num1 + " and " + num2 + " is equal to " + mult + '.');
	System.out.println("The division of 2 numbers " + num1 + " and " + num2 + " is equal to " + div + '.');

		
	}

}
