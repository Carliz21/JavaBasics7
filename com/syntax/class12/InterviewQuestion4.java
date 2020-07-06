package com.syntax.class12;

public class InterviewQuestion4 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?
		// Maximum and minimum number in the array?

		int[] numbers = { 52, 65, 36, 45, 57, 36, 78 };

		int second = numbers[0];
		int largest = numbers[0];
		int min = numbers[0];

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] > largest) {
				second = largest;
				largest = numbers[i];

			} else if (numbers[i] > largest) {
				second = numbers[i];
			} else if (min > numbers[i]) {
				min = numbers[i];
			}

		}
		System.out.println("The second largest number is the array is :" + second);
		System.out.println("The largest number in the array is : " + largest);
		System.out.println("The minimun number in the array is: " + min);

	}

}
