package com.syntax.class29;

public class Car {

	double carPrice;
	String carColor;

	Car(double carPrice, String carColor) {
		this.carPrice = carPrice;
		this.carColor = carColor;
	}

	double calculateSalePrice() {

		return carPrice;
	}
}

class Truck extends Car {// Truck
	double weight;

	Truck(double carPrice, String carColor, double weight) {
		super(carPrice, carColor);
		this.weight = weight;
	}

	double calculateSalePrice() {
		if (this.weight > 2000) {
			return carPrice - (carPrice * 0.1);
		} else {

			return carPrice - (carPrice * 0.2);
		}
	}
}

class Sedan extends Car {// Sedan
	double length;

	Sedan(double carPrice, String carColor, double length) {
		super(carPrice, carColor);
		this.length = length;
	}

	double calculateSalePrice() {
		if (this.length > 20) {
			return carPrice - (carPrice * 0.05);
		} else {
			return carPrice - (carPrice * 0.1);
		}
	}

}
