package com.syntax.class05;

public class LogicNot {
	public static void main(String[] args) {
		
	int day = 5;
	// 1st way 
	if (day != 1 && day !=5) {
		System.out.println("We have a class");
	} else {
		System.out.println("We are sleeping");
	}
	
	// 2nd way 
	
	if (!(day ==1) && !(day ==5)) {
		System.out.println("We have a class");
	} else {
		System.out.println("We are sleeping");
	}
	
	// 3rd way, easiest!!
	
	if (!(day ==1 || day ==5)) {
		System.out.println("We have a class");
	} else {
		System.out.println("We are sleeping");
	}
	
	// Boolean example 
	
	boolean isRaining = false;
	if (!isRaining) {
		System.out.println("1");
	}else {
		System.out.println("2");
	}
	
	
	
	}

}
