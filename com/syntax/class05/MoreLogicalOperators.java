package com.syntax.class05;

public class MoreLogicalOperators {
	public static void main(String[] args) {

		// We have 7 days of week
		// if day is 2,4 --> SDLC class
		// if day is 6,7 --> JAVA class
		// if day is 1,5-> No class
		// if day is 3 --> Review class

		int day = 7;
// To compare the equality of two numbers we use == 
		if (day == 2 || day == 4) {
			System.out.println("SDLC class");
		} else if (day == 6 || day == 7) {
			System.out.println("JAVA class");
		} else if (day == 1 || day == 5) {
			System.out.println("No class");
		} else if (day == 3) {
			System.out.println("Review class");
		} else {
			System.out.println("Wrong day");
		}

		System.out.println("******Using String*****");
		// To compare the equality of two strings we use.equals("")

		String day2 = "Tuesday";
		
		if (day2.equals("Tuesday") || day2.equals("Thursday")) {
			System.out.println("SDLC class");
		} else if (day2.equals("Saturdday") || day2.equals("Sunday")) {
			System.out.println("Java class");
		} else if (day2.equals("Friday") || day2.equals("Monday")) {
			System.out.println("No class");
		} else if (day2.equals("Wednesday")) {
			System.out.println("Review class"); 
		} else {
			System.out.println("wrond day");
		}

	}

}
