package com.syntax.class23;

public class IceCream {

	String flavor, brand, color; // instance variable

	public IceCream(String flavor, String brand, String color) {
		// creating a constructor by calling the class name
		this.brand = brand;
		this.flavor = flavor;
		this.color = color;

	}

}

class Gelato extends IceCream {
	
	public Gelato(String flavor, String brand, String color) {
		super(flavor, brand,color);
	}
	
}

class Sorbeto extends IceCream {
	
	double price;
	
	public Sorbeto (String flavor, String brand, String color, double price) {
		super(flavor, brand, color);// super must be first line otherwise CE
		this.price=price;	
		
	}
}

class miniSorbeto extends Sorbeto{
	
	int calories;

	public miniSorbeto (String flavor, String brand, String color, double price, int calories) {
		super(flavor, brand, color, price);
		this.calories=calories;
	}
}
