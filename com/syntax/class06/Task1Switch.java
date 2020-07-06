package com.syntax.class06;

import java.util.Scanner;

public class Task1Switch {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your country");
		String country = input.nextLine();

		String language;

		switch (country) {

		case "USA":
			language = "English";
			break;
		case "Mexico":
			language = "Spanish";
			break;
		case "France":
			language = "French";
			break;
		case "Brazil":
			language = "Portuguese";
			break;
		case "Germany":
			language = "German";
			break;
		default:
			language = "Unknown";
			break;

		}
		System.out.println("The language you speak in your country is " +language);

	}

}
