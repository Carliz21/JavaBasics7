package com.repl.excercises;

import java.util.Scanner;

public class ReplExpectedBrowser {

	public static void main(String[] args) {

		/*
		 * If browser is ChRoME it should print the: "Proceed with Chrome browser"
		 * 
		 * If browser is FireFOX it should print the:"Proceed with Firefox browser"
		 * 
		 * If browser is IE it should print the: "Proceed with IE browser"
		 * 
		 * If any other browser it should print the: "Invalid browser"
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser name to proceed further with execution");
		String browser = sc.nextLine();

		if (browser.equalsIgnoreCase("ChRome")) {
			System.out.println("Test executed on chrome browser");
		} else if (browser.equalsIgnoreCase("FireFOX")) {
			System.out.println("Proceed with Firefox browser");
		} else if (browser.equalsIgnoreCase("IE")) {
			System.out.println("Proceed with IE broswer");
		} else {
			System.out.println("Invalid browser");
		}

	}

}
