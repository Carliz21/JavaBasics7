package com.syntax.class12;

public class Task {

	public static void main(String[] args) {

		/*
		 * Create a 2D that will store food of different kinds and retrieve all values
		 * from array using 2 diff loops
		 */

		String[][] foods = { { "Tacos", "Enchiladas" }, { "Tandoori chicken", "Vindaloo" },
				{ "Pizza", "Pasta", "Salmon" }

		};

		for (int row = 0; row < foods.length; row++) { // loops over rows or 1D arrays
			for (int col = 0; col < foods[row].length; col++) {
				String food = foods[row][col];
				System.out.print(food + " ");

			}
			System.out.println();
		}

		// lets create a 2D array of int and calculate the sum of all odd numbers

		int[][] numbers = { { 10, 23, 56, 47 }, { 33, 668, 89 }, { 1, 9, 0 } };

		System.out.println("-----Using regular For Loop");

		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {

			for (int j = 0; j < numbers[i].length; j++) {

				int element = numbers[i][j];
				if (element % 2 == 1)
					sum += element;
			}
			
		}
		System.out.println("The sum of all odd numbers in this array is : " + sum);

	}

}
