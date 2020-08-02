package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class TaskRemoveE {
	
	public static void main(String[] args) {
	
		 //Create an arrayList of words. Remove every word that ends with “e”.
		
		
		ArrayList<String> words = new ArrayList<>();
		words.add("Red");
		words.add("Blue");
		words.add("Green");
		words.add("Purple");
		words.add("Coffee");
		words.add("Tree");
		
		
		System.out.println("List of words before removing : " + words);
		
		Iterator <String> wordsIt= words.iterator();
		
		while (wordsIt.hasNext()) {
			String element = wordsIt.next();

			if (element.endsWith("e")) {
				wordsIt.remove();
			}

		}

		System.out.println("List of words after removing: " + words);
		
		
		
	
		
		
		
	}
	

}
