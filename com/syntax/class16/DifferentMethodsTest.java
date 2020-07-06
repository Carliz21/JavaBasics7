package com.syntax.class16;

public class DifferentMethodsTest {
	public static void main(String[] args) {

		DifferentMethods obj = new DifferentMethods();
		// call method to sayHello
		obj.sayHello(5);

		System.out.println("-------call method to printAnyword as many times specified----");
		obj.printAnyWord("I love you", 3);
		obj.printAnyWord("Bye", 5);

		System.out.println("---------call method isHungry-------------------------------");
		obj.IsHungry(false);

	}

}
