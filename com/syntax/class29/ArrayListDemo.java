package com.syntax.class29;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();
		// to add values to arrayList
		arrayList.add("Hello");// 0
		arrayList.add("Welcome");// 1
		arrayList.add("How are you");// 2
		
		System.out.println("Original arrayList = " + arrayList);

		// How many elements inside my ArrayList
		int arrayListSize = arrayList.size();
		System.out.println("Size of original arrayList= " + arrayListSize);

		// How to acccess elements from ArrayList
		String element2 = arrayList.get(2);
		System.out.println("Accessing arrayList element2= " + element2);

		// How to add more Objects to ArrayList
		arrayList.add("Good Bye");
		arrayList.add("Thank you");

		System.out.println("Size of arrayList after adding more String objects= " + arrayList.size());
		System.out.println("Arraylist after adding more String objects" + arrayList);

		// Let's remove "Hello";
		arrayList.remove(0);

		System.out.println("Size of arrayList after removing Object = " + arrayList.size());
		System.out.println("ArrayList after removing object= " + arrayList);
		
		//I want update value "Good Bye" --> "Bye"
		arrayList.set(2, "Bye");
		System.out.println("ArrayList after replacing Object " + arrayList);
	}

}
