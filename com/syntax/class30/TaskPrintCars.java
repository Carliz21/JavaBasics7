package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

import com.syntax.class11.Cars;

public class TaskPrintCars {

	public static void main(String[] args) {

		// Create an arraylist of cars and retrieve all the values using 3 different
		// ways.

		ArrayList<String> cars = new ArrayList<>();
		cars.add("Tesla");
		cars.add("Jeep");
		cars.add("Toyota");

		System.out.println("------1st way---------------");
		for (String carName : cars) {
			System.out.print(carName + " ");
		}

		System.out.println();
		System.out.println("--------2nd way-----------");

		for (int i = 0; i < cars.size(); i++) {
			String myCars = cars.get(i);
			System.out.print(myCars + " ");
		}

		System.out.println();
		System.out.println("-------3rd way-----------");

		Iterator<String> carIt = cars.iterator();
		while (carIt.hasNext()) {
			System.out.print(carIt.next() + " ");
		}

	}

}
