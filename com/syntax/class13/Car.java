package com.syntax.class13;

public class Car {
    // created a template / creating a blueprint
	// define car features in form of variables

	String make;
	String model;
	String color;
	int year;
	int speed;
	
	public static void main (String []args) {
		
		System.out.println("Hello, I am code from main method");
		
		Car c1=new Car();
		c1.make = "Toyota";
		c1.model="Camry";
		c1.color="Yellow";
		c1.year=2020;
		c1.speed=180;
		// calling method drive
		c1.drive();
		//calling method transport people
		c1.transportPeople();
		c1.reverse();
		c1.stop();
		
				
	}
	
	
	// define behaviors in a form of methods
	
	void drive() {
		System.out.println(make+ " can drive");
	}
	
	void reverse () {
		System.out.println(make+" can reverese");
	}
	
	void transportPeople() {
		System.out.println(make+" can transport people");
		
	}
	
	void stop() {
		System.out.println(make+" can stop");
	}
}
