package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class RemovingElementsFromCollection {

	public static void main(String[] args) {

		// Create an ArrayList of city names

		ArrayList<String> cities = new ArrayList<>();
		cities.add("Kyiv");
		cities.add("LA");
		cities.add("LA");
		cities.add("Istanbul");
		cities.add("DC");
		cities.add("New York City");

		System.out.println("Original ArrayList ===" + cities);
		// Remove cities LA, DC

		System.out.println("----Removing objects from list using for loop----");
		for (int i = 0; i < cities.size(); i++) {
			if (cities.get(i).equals("LA") || cities.get(i).equals("DC")) {
				cities.remove(i);
			}
		}
		System.out.println("After removing == " + cities);

		System.out.println("----Removing objects using enhanced for loop----");

//		for (String city:cities) {
//			if (city.equals("New York City")) {
//				cities.remove(city);
//			}
//		}

		System.out.println(cities);

		System.out.println("-----Removing objects using iterator------");

		cities.add("LA");

		cities.add("LA");

		cities.add("Miami");

		System.out.println(cities);

		Iterator<String> citiesIT = cities.iterator();
		while (citiesIT.hasNext()) {
			if (citiesIT.next().equals("LA")) {
				citiesIT.remove();
			}
		}
		System.out.println("ArrayList after modifications from Iterator= " + cities);
	}

}
