package com.syntax.class11;

public class RetrieveElements {

	public static void main(String[] args) {



		String[] fruits = { "Apple", "Orange", "Grapes", "Banana", "Cucumber" };
		// Print all the fruits in 2 different ways

			for (String f: fruits) {
				System.out.println(f);

				System.out.println("-------------------------------");

				for (int j = 0; j < fruits.length; j++) {
					System.out.print(fruits[j] + " ");
				}
			}

		}

	}


