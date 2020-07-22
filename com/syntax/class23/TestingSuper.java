package com.syntax.class23;

public class TestingSuper {
	public static void main(String[] args) {

		Subclass obj = new Subclass();
		obj.displayName();
		obj.callingParentMethod();
		obj.printHello();
		
		System.out.println("-----object from Parent class-----------------");
		
		SuperClass obj1= new SuperClass();
		obj1.printHello();
		System.out.println(obj1.name);

	}

}
