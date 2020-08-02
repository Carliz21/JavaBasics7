package com.syntax.group;



public interface Shape {
	void calculateArea();

	void calculatePerimiter();
}

class Square implements Shape {
	double a;
	double perimiter;

	public void calculateArea() {
		System.out.println();
	}

	public void calculatePerimiter() {
		perimiter = 4 * a;
		System.out.println("The Perimiter of Square is=" + perimiter);
	}
}

