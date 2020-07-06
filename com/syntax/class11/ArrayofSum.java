package com.syntax.class11;

public class ArrayofSum {

	public static void main(String[] args) {

		int[][] numbers = {

				{ 12, 24, 36 }, { 33, 56, 78 }, { 22, 98, 100 }

		};

		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {

			for (int j = 0; j < numbers[i].length; j++) {
				int number = numbers[i][j];
				sum += number;
			}
		}
 System.out.println("The sum of all numbers is " + sum);
	}

}
