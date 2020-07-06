package com.syntax.class14;

public class StringMethods {

	public static void main(String[] args) {

		// First way to create a String--> Most popular way
		String name = "Olga";

		// Second way to create String
		String name1 = new String();
		name1 = "Olga";

		System.out.println(name);
		System.out.println(name1);

		// Methods of String Class
		
		System.out.println("-----------------.length () method------------------------------");
		// tells how many characters are in the String
		String school = "Syntax";
		int size = school.length();
		System.out.println("The length of this String is = " + size);

		String greetings = "Hello Syntax";
		int sizeOfGreetings = greetings.length(); // will also count spaces
		System.out.println("The length of Hello Syntax is: " + sizeOfGreetings);
		
		System.out.println("---------------------.toUpperCase() method-----------------------");
		// Converts our String all to Upper case letters
		String city= "Washington DC";
		String newCity=city.toUpperCase();
		System.out.println(newCity);
		
		System.out.println("-----------------.toLowerCase() method----------------------------");
		// Converts our String all to lower case letters
		String lowerCaseString=newCity.toLowerCase();
		System.out.println(lowerCaseString);
		
		System.out.println("-----------------.concat() method---------------------------------");
		// combining two Strings together
		String country="USA ";
		String capital="Washington DC";
		// + with String serves as concatenation operator
		//+ with numbers serves as arithmetic operator
		// i.e. 
		System.out.println(country +capital);
		
		System.out.println(country.concat(capital)); //will work only if both values are of the String type
		
		System.out.println("---------------------.isEmpty() method-----------------------------");
		// if length of the String is =0 --> then it is empty
		String str="Hello"; //even is there is a space inside it will count and return boolean value of true
		boolean isEmpty=str.isEmpty();
		System.out.println(isEmpty);
		
		System.out.println("-------------------.trim() method------------------------------------");
		
		String cat= "My cat name is Jessy";
		String dog="    My dog name is   Charly   ";
		System.out.println("---------------------Before trimming----------------------------------");
		System.out.println(cat);
		System.out.println(dog);
		
		// trim will cut spaces before and after String -- never in the middle!!!
		System.out.println("-----------------------After trimming----------------------------------");
		System.out.println(cat.trim());
		System.out.println(dog.trim());
		
		
		

	}

}
