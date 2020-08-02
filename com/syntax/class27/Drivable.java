package com.syntax.class27;

public interface Drivable { // interface is collection of public abstract methods and public static final
							// variables

	String DRIVE = "Drive safe";// by default compiler adds public static final to variables

	// int maxSpeed;// cannot have instance variables because compiler adds public
	// static final

	void driving();// if we do not add public abstract Complier will add auto

	void breaking();
}
//We can only extend one class but multiple interfaces
abstract class Motorcycle extends Vehicle implements Drivable{ // if we do not use other method then we make it abstract class
	
	public void driving() {
		System.out.println("Motorcycleis driving");
	}
	
	
}

class Bike extends Motorcycle {// child classs
	
	public void breaking() {
		System.out.println("All bikes can break");
	}
}
class Vehicle {
	
	public void operateVehicle() {
		System.out.println("We need a drivers license to operate a vehicle");
	}
}


