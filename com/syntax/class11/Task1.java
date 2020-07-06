package com.syntax.class11;

public class Task1 {
	
	public static void main(String[] args) {
		
		String [] cars= {"Toyota", "Ford", "Honda", "BMW", "Audi", "Lexus"};
		
		for (String element:cars) {
			System.out.println(element);
		}
		
	System.out.println("-----------------------------");	
		
		int[] numbers = {10,20,30,40,50};
		int total=0;
		
		for ( int num :numbers) {
			total += num;
		}
		System.out.println("The sum of all numbers is: " + total);
		
		
		System.out.println("--------Second way-Using for loop----------");
		int sum=0;
		for (int i =0; i<numbers.length; i++) {
			int num= numbers[i];
			total += num;
		}
		System.out.println("The total of all numbers is: " + total);
		
		
		
		
		
		
		
		
		
		
	}

}
