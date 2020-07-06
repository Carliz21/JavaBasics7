package com.syntax.class11;

public class Largest {
	public static void main(String[] args) {
		// Find the largest number in the array

		int[] numbers = { 23, 56, 73, 16, 80, 70, 39 };

		int largest = 0;

		for (int num : numbers) {
			if (num > largest) {
				largest = num;
			}

		}

		System.out.println(largest);
		
		// if it's negative then we say int largest = numbers[0];
	}

}
