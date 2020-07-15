package com.syntax.class22;

public class Car {
	
	String make;

	public Car(String make) {
		this.make=make;
	}

}

class Tesla extends Car {

	boolean autopilot;

	public Tesla(String make ,boolean autopilot) {
		super(make);
		this.autopilot=autopilot;
		//System.out.println("I am a non argument constructor of a child class");
	}

	void info() {
		System.out.println("We build " + make + " that has autopilot feature = " + autopilot);
	}

}
