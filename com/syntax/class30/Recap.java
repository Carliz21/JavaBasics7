package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {

	public static void main(String[] args) {

		ArrayList<Double> numbers = new ArrayList<>();

		numbers.add(10.99);// boxing
		numbers.add(8.99);
		numbers.add(9.99);
		numbers.add(9.99);
		numbers.add(9.99);
		// numbers.add(7);--> Cannot store Integer objects into ArrayList of Double
		// Objects

		System.out.println(numbers);

		Double num = numbers.get(2);
		double num1 = numbers.get(1);// unboxing

		System.out.println("------------Retrieving values using advanced For Loop------------");

		for (Double number : numbers) {
			System.out.print(number + " ");
		}

		System.out.println();
		System.out.println("------------ Retrieve values backwards-------------");

		for (int i = numbers.size() - 1; i >= 0; i--) {
			double myNumbers = numbers.get(i);
			System.out.print(myNumbers + " ");
		}

		System.out.println();
		System.out.println("------ Retrieving all values using Iterator-----------");

		Iterator<Double> it = numbers.iterator();
		// next();--> gives next object
		// hasNext();--> checks if there is a next element
		// remove();--> removes element from the collection

		double d = it.next();
		double d1 = it.next();
		System.out.println(d1);

		System.out.println("------Printing all values using Iterator------------");
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
		System.out.println();
		System.out.println("---- Printing all values using new Iterator object----------");
		Iterator<Double> doubleIT = numbers.iterator();
		while (doubleIT.hasNext()) {
			double element = doubleIT.next();

			if (element < 9) {
				doubleIT.remove();
			}

		}

		System.out.println(numbers);

	}

}
