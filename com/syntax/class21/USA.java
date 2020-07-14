package com.syntax.class21;

public class USA {
	
	public static String country;
	String state;
	String capital;
	
	USA (String state,String capital){
		this.state=state;
		this.capital=capital;
		
	}
	
	void displayState () {
		System.out.println("state is =" + state);
	}
	void displayCapital () {
		System.out.println("capital is = " + capital);
	}
	
	void displayInfo () {
		displayState(); // this.displayState(); Compiler adds this to refer to instance method
		this.displayCapital();// we can add it but we don't need to since compiler will do automatically
	}

}
