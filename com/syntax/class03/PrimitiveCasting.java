package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		// widening , implicit casting, automatically
		double d = 7;
		System.out.println(d);

		// int i = 7.58; // compile time error
		// double to int

		// narrowing , explicit casting , manually
		int i = (int) 7.58;
		System.out.println(i);

		// narrowing a large number into a byte
		// manually
		// you are trying to fit something
		// from a big box into a small
		byte b = (byte) 123865;
		System.out.println(b);

		long l1 = 45;
		long l2 = 12345667l;

		// you are trying to fit something
		// from a big box into a small
		int number2 = (int) l1;
		System.out.println("number2 = " + number2);

		int number = (int) l2;
		System.out.println(number);
		

		
		

	}

}
