package com.syntax.class06;

import java.util.Scanner;

public class Homework1WithSwitch {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your birth month");
		String month = input.next();

		String season;

		switch (month) {
		case "December":
		case "January":
		case "February":
			season = "Winter";
			break;
		case "March":
		case "April":
		case "May":
			season = "Spring";
			break;
		case "June":
		case "July":
		case "August":
			season = "Summer";
			break;
		case "September":
		case "October":
		case "November":
			season = "Fall";
			break;
		default:
			season = "Unknow";
			break;

		}
		System.out.println("You were born in " + season);
	}

}
