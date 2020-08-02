package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> food = new LinkedList<>();
		food.add("beshparmark");
		food.add("pizza");
		food.add("biryani");
		food.add("tacos");

		String myFood = food.get(2);
		System.out.println(myFood);

		LinkedList<String> desserts = new LinkedList<>();
		desserts.add("cake");
		desserts.add("ice cream");
		desserts.add("cookies");

		food.addAll(desserts);// adding elements from another list
		System.out.println(food);

		food.remove("pizza");
		System.out.println("LinkedList after removing element-->pizza--> " + food);

		food.set(3, "brownie");
		System.out.println("LinkedList after replacing element --> cake--> " + food);

		Iterator<String> foodIterator = food.iterator();
		while (foodIterator.hasNext()) {
			String foodList = foodIterator.next();
			System.out.print(foodList + " ");
			if (foodList.equals("cookies") || foodList.equals("brownie")) {
				foodIterator.remove();
			}
		}

		System.out.println();
		System.out.println("LinkedList after using Iterator to remove elements-> " + food);
		
		System.out.println("--------Using LinkedList with Country Class-----");
		
		//LinkedList with country types of objects
		
		LinkedList<Country> countries=new LinkedList();
		countries.add(new USA("USA"));
		countries.add(new Afghanistan("Afghanistan"));
		countries.add(new Kazakhstan("Kazakhstan"));
		
		System.out.println("Collection of Country Objects has " + countries.size() + " elements");
		
		for (Country ctr: countries) {
			ctr.election();
			
		}
		
		
		
	}

}
