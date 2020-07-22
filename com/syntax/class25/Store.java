package com.syntax.class25;

public class Store {

	String name, location;

	public Store(String name, String location) {
		this.name = name;
		this.location = location;
	}

	public void openHours() {
		System.out.println(name + " is open from 8AM-8PM");
	}

	public void sell() {
		System.out.println("Stores sell items");
	}

}

class Macys extends Store {

	public Macys(String name, String location) {
		super(name, location);
	}

	public void openHours() {
		System.out.println(name + " is open from 8AM-12 AM");
	}

}

class Starbucks extends Store {

	public Starbucks(String name, String location) {
		super(name, location);
	}

	public void openHours() {
		System.out.println(name + " is open everyday from 6AM-10PM");
	}

	public void sellDrinks() {
		System.out.println(name + " sells different types of drinks");
	}
}

class Nike extends Store {

	public Nike(String name, String location) {
		super(name, location);
	}
}