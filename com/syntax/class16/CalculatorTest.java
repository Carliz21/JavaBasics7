package com.syntax.class16;

public class CalculatorTest {

	public static void main(String[] args) {

		Calculator c = new Calculator();
		c.add(20, 30);
		c.add(500, 100);
		c.add(30, 55);

		c.sub(100, 10);

		c.div(10, 2);

		c.mult(10, 10);

		// c.mult(10);CE-->number of values must match number of parameters

		// c.mult(10.99,9.99); CE -->values must match type of parameter

	}

}
