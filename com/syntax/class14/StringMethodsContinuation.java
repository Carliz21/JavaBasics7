package com.syntax.class14;

public class StringMethodsContinuation {

	public static void main(String[] args) {

		System.out.println("-------------------.contains() method------------------------------------");
		// checks if String contains another sequence of specified characters
		String str = "Good afternoon All";

		boolean contains = str.contains("afternoon");
		System.out.println(contains);

		String searchValue = "good";
		boolean isThere = str.contains(searchValue);
		System.out.println(isThere);

		System.out.println(str.contains("A"));
		System.out.println(str.contains("after "));

		System.out.println("-------------------.startsWith() method------------------------------------");
		// searches the value the String starts with and gives response as boolean value
		String drink = "Welcome students";
		boolean starts = drink.startsWith("Welcome");
		System.out.println(starts);

		System.out.println("-------------------.endsWith() method------------------------------------");
		boolean ends = drink.endsWith("a");
		System.out.println(ends);

		String str1 = "Hello Mohammad";
		String str2 = "Hello Bulat";

		System.out.println("String " + str2 + " equals to: " + str2.endsWith("Bulat"));

		System.out.println("-------------------.equals() method------------------------------------");
		// Checks for equality
		
		String string1="Saturday";
		String string2="Saturday";
		
		boolean equality=string1.equals(string2);
		System.out.println(equality);
		
		System.out.println("-------------------.equalsIgnoreCase() method----------------------------");
		// checks for equality between Strings regardless of upper case or lower case input
		boolean equalityNoCase=string1.equalsIgnoreCase(string2);
		System.out.println(equalityNoCase);
		
		System.out.println("----------------Real example of .equals()------------------------------");
		
		String expected="Password cannot be empty";
		String actual="password cannot be empty";
		
		if(expected.equals(actual)) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test fail");
		}
		System.out.println("------------Real example of .equalsIgnoreCase() method----------------------");
		
		String expectedBrowser="Chrome";
		
		if (expectedBrowser.equalsIgnoreCase("chrome")) {
			System.out.println("Test executed on chrome browser");
		} else {
			System.out.println("Test executed NOT on chrome browser");
		}
		
		String str6 = "0123456789";
		System.out.println(str6.substring(4));
		
	}

}
