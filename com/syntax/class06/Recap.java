package com.syntax.class06;

public class Recap {
	public static void main(String[] args) {

		// Why we need logical operators?
		// To test 2 or more conditions (and combine them)
		// AND && --> both conditions should be true
		// OR ||--> at least one condition should be true
		// NOT !--> reverse the condition
		// if hour is between 1-11-->morning
		// if hour is between 12-15--> afternoon
		// if hour is between 16-20--> evening
		// if hour is between 21-24--> night
		// We will print: Right now is ______

		int hour = 35;
		String dayTime;

		if (hour >= 1 && hour <= 11) {
			dayTime = "morning";
		} else if (hour >= 12 && hour <= 15) {
			dayTime = "afternoon";
		} else if (hour >= 16 && hour <= 20) {
			dayTime = "evening";
		} else if (hour >= 21 && hour <= 24) {
			dayTime = "night";
		} else {
			dayTime = "unknown";
		}
		// if it is unknown I don't want to print anything
		if (!dayTime.equalsIgnoreCase("Unknown")) {
			System.out.println("Right now it is " + dayTime);
		}
		
		/* When compiler gives you an error saying that the variable must be initialized:
		 * Compiler will assign a default value:
		 * default value for String --> null;
		 * default value for int--> 0;
		 * default value for double --> 0.0;
		 * default value for boolean--> false;
		 * default value for char--> 0;// 0 means empty space
		 */

	}

}
