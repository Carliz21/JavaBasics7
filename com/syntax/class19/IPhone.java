package com.syntax.class19;

public class IPhone {
	
	static String brand="Apple";
	static String OS="iOS";
	static boolean touchScreen= true;
	
	String model;
	int memory;
	double price;
	String color;
	
	
	static void displayInfo() { // static works only with static 
	System.out.println("iPhone belongs to brand " + brand + " and it has OS as " + OS 
			+ " and all iPhones have touchscreen= " + touchScreen);	
	}
	
	// static void displayDetails () { // static methods cannot access instance/non static members/variables
	//	System.out.println("We build iPhone " + model+ " with memory= " + memory + " in " + color 
	//			+ " color and priced at $" + price );
		
	//}
	
	
	void displayDetails () {
		System.out.println("We build iPhone " + model+ " with memory= " + memory + " in " + color 
				+ " color and priced at $" + price );
		
	}
	
	// can instance method/non static method access static members/variables
	 void displayInfo1() { //instance works with static variables
		System.out.println("iPhone belongs to brand " + brand + " and it has OS as " + OS 
				+ " and all iPhones have touchscreen= " + touchScreen);	
		}
	
	

}
