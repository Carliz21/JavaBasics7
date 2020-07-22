package com.syntax.class25;

public class Computer {

	// Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP,
	// Dell.
	// Define common behavior within and some fields in parent class and override
	// some of the methods in child classes
	// Define some methods specific to child classes
	// Create objects of child classes and store them into array. Loop through each
	// object and execute available methods.

	String type;
	int price;

	public Computer(String type, int price) {
		this.type = type;
		this.price = price;

	}

	public void use() {
		System.out.println(type + " computers are perfect for Students");
	}

	public void battery() {
		System.out.println(type + " computers last 10 hours ");
	}

}

class Apple extends Computer {

	public Apple(String type, int price) {
		super(type, price);
	}

	public void battery() {
		System.out.println(type + " battery last up to 12 hours");
	}

}

class Lenovo extends Computer {
	
	public Lenovo (String type, int price) {
		super(type, price);
	}
	                                     
}
class HP extends Computer {
	
	public HP (String type, int price) {
		super(type, price);
	}
	
	public void battery () {
		System.out.println(type + " battery last up to 6 hours ");
	}
}
class Dell extends Computer {
	
	public Dell (String type, int price) {
		super(type, price);
	}
}
