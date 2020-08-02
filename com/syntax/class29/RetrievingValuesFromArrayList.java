package com.syntax.class29;

import java.util.ArrayList;
import java.util.Iterator;


public class RetrievingValuesFromArrayList {
	
	public static void main(String[] args) {
		
		ArrayList <String> names= new ArrayList<>();
		names.add("Ahmet");
		names.add("John");
		names.add("Lucy");
		names.add("George");
		names.add("Henry");
		
		//How to retrieve a value
		
		String str = names.get(3);
		System.out.println(str);
		
		System.out.println("---Retrieving values 1 by 1 using enhanced for loop-------");
		//How to retrieve values 1 by 1
		for(String name:names) {
			System.out.println(name);
			if (name.equals("Ahmet")) {
				System.out.println("Ahmet you are awesome");
			}
		}
		
		System.out.println("----Retrieving values using 1 by 1 with for loop-----");
		for (int i =0; i <names.size();i++) {
			String s=names.get(i);
			System.out.println(s);
		}
		
		System.out.println("----Retrieivng values using iterator-------");
		
		Iterator <String> it=names.iterator();
		
		while(it.hasNext()) {
			String name=it.next();
			System.out.println(name);
		}
		
		
		
		
		
	}

}
