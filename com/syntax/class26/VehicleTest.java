package com.syntax.class26;

public class VehicleTest {

	public static void main(String[] args) {

		Vehicle lambo = new Lambo("123455678KLHHH");
		lambo.drive();
		lambo.start();
		lambo.stop();
		lambo.openTrunk();
		int total = Vehicle.getTotal();
		System.out.println(total);

		System.out.println("--------------second object-------------------------");

		Vehicle car = new Lambo("KLHHH996674322");
		car.drive();
		car.start();
		car.stop();
		car.openTrunk();

		total = Car.getTotal();
		System.out.println(total);

	}

}
