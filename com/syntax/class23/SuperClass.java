package com.syntax.class23;

public class SuperClass {
	
	String name= "Kamila";
	
	public void printHello() {
		System.out.println("Hello from parent class");
	}

}

class Subclass extends SuperClass {
	
	String name="Mina";
	
	public void displayName () {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void printHello() {
		System.out.println("Hello from child class");
	}
	
	public void callingParentMethod () {
		super.printHello();
	}
	
}
