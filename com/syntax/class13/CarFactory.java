package com.syntax.class13;

public class CarFactory {
	public static void main(String[] args) {

		// building an object of the car

		Car car1 = new Car();
		car1.make = "Tesla";
		car1.model = "X";
		car1.color = "Red";
		car1.year = 2020;
		car1.speed = 200;
		System.out.println("Make of first car is " + car1.make + " and model is " + car1.model + " and it is "
				+ car1.color + " color");
		System.out.println("----Accessing methods from Car class using car1--");
		car1.drive(); // drive is the name of method
		car1.reverse(); // reverse is the name of method
		car1.transportPeople();// transport people is the name of the method

		// building an object of the car
		Car car2 = new Car();
		car2.make = "BMW";
		car2.model = "M5";
		car2.color = "Blue";
		car2.year = 2018;
		car2.speed = 240;
		System.out.println("Make of second car is " + car2.make);

		System.out.println("----Accessing methods from Car class using car2--");
		car2.drive(); // drive is the name of method
		car2.reverse(); // reverse is the name of method
		car2.transportPeople();// transport people is the name of the method

		Car car3 = new Car();
		car3.make = "Toyota";
		car3.model = "Corolla";
		car3.color = "Gray";
		car3.year = 2013;
		car3.speed = 180;
		System.out.println("Make of third car is " + car3.make);
		
		System.out.println("---Accessing methods from Car class using car3--");
		car3.drive(); // drive is the name of method
		car3.reverse(); // reverse is the name of method
		car3.transportPeople();// transport people is the name of the method

		Car car4 = new Car();
		car4.make = "Honda";
		car4.model = "Accord";
		car4.color = "Black";
		car4.year = 2020;
		car4.speed = 240;
		System.out.println("Make of fourth car is " + car4.make);
		
		System.out.println("---Accessing methods from Car class using car4--");
		car4.drive(); // drive is the name of method
		car4.reverse(); // reverse is the name of method
		car4.transportPeople();// transport people is the name of the method

		// new Bus(); compiler will give an error
		// because we never created a Bus class

	}

}
