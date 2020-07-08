package com.syntax.class18;

public class Cat {
	
	String name, color;
	int age;
	
	// static
	
	static int paws=4;
	static boolean mustache=true;
	static boolean tail=true;
			
	
	void displayCat() {
		System.out.println("Name of cat is " +name
				            +" and this cat is " +color
				            + " and it is " +age+" years old");
	}
	
	void displayCommonFeatures() {
		System.out.println(name + "has " + paws + "paws and " 
	                       + "tail= " + tail 
	                       + "and mustache= " + mustache);
	}

}
