package com.syntax.class12;

public class Recap2DArray {

	public static void main(String[] args) {

		String[][] animals = {

				{ "cats", "dogs", "birds", "hamsters" }, // first array or 1 row
				{ "tiger", "lion", "bear" }, // second array or 2 row
				{"salmon", "shrimp", "sea bass"}// third array or 3 row

		};

		int howManyArrays = animals.length; // how many rows
		System.out.println(howManyArrays);

		int element1Array = animals[1].length; // how many columns in 2 row
		System.out.println(element1Array);

		String element = animals[1][1]; // retrieving one specific element from array
		System.out.println(element);
		
		System.out.println("-------USING FOR LOOP-----------------");

		// how to get all elements from 2D array

		for (int row = 0; row < animals.length; row++) { // loops over rows or 1D arrays
			for (int col = 0; col < animals[row].length; col++) {
				String animal = animals[row][col];
				System.out.print(animal + " ");
			}
			System.out.println();

		}
		
		System.out.println();
		System.out.println("-------USING ENHANCED FOR LOOP-----------");
		
		for (String[]array:animals) { // string [] array = {animal list}
			
			for (String animal:array) { // 
				System.out.println(animal);
			}
			
		}
		

	}

}
