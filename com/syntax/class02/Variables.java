package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
// Part A:
		String name = "Carmen";
		String lastName = "Ferrufino";
		String grade = "A+";
		String city = "Annandale";
		String state = "VA";
		// phone number can use as int
		int phoneNumber1 = 1234567890;
		String phoneNumber = "(123)456-7890";

		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
// Part B:
	
		city = "Sprinfield";
		state = "Illinois";
		phoneNumber = "(987)654-3210";
		grade = "B";
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		System.out.println(grade);
		
		// 1. My name is  and my last name is 
		// 2. I live in city of  and state of  and my phone number is 
		
		char period = '.';
		char comma = ',';
		
		// Don't add space in variable!!! 

		System.out.println("My name is " +name + " and my last name is " +lastName + '.');
		System.out.println("I live in the city of " + city  +  ','  +  state  +  " and my phone number is " + phoneNumber + '.');
	
	

	}

}
