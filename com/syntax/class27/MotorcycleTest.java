package com.syntax.class27;

public class MotorcycleTest {

	public static void main(String[] args) {

		// new Drivable();CE: cannot instantiate

		// new Motorcycle ();CE: cannot instantiate

		System.out.println("------Object of Motorcycle type----------------------------");
		Motorcycle m = new Bike();
		m.breaking();
		m.driving();
		m.operateVehicle();
		// Motorcycle.DRIVE="not safe";CE; cannot change value of static variables
		System.out.println(Motorcycle.DRIVE);

		System.out.println("---------Object of Drivable type-------------------------");

		Drivable d = new Bike();
		d.breaking();
		d.driving();
		System.out.println(Drivable.DRIVE);

		System.out.println("-----Object of Vehicle type--------------------");

		Vehicle v = new Bike();//Vehicle --> Motorcycle --> Bike
		v.operateVehicle();

	}

}
