package com.syntax.class29;

import java.util.ArrayList;

public class ArrayTask {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		names.add("John");
		names.add("James");
		names.add("Carlos");
		names.add("Kathy");
		names.add("Brian");

		boolean nameEmpty = names.isEmpty();
		System.out.println(nameEmpty);

		boolean containsName = names.contains("Carmen");
		System.out.println(containsName);

		int numberOfNames = names.size();
		System.out.println("Total of names in ArrayList = " + numberOfNames);
		System.out.println("Listing names on ArrayList= " + names);

		names.remove("Carlos");
		System.out.println("List of names after removing Carlos= " + names);

	}

}
