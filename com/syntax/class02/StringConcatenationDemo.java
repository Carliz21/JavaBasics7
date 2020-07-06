package com.syntax.class02;

public class StringConcatenationDemo {

	public static void main(String[] args) {
	//I love Me
		String name = "Me";
		name= " Carmen "; 
		
		 System.out.println("I love " + name); // prefer way
		 System.out.println("I love" + " " + name);
		 
		 String statement = "I love" ;
		 
		 System.out.println(statement + name);
		 
		 //I dont want to change my variables
		 System.out.println(statement + " " + name);
		 
		 String car = "BMW";
		 int year = 2020;
		 // Concatenation of two Strings
		 System.out.println( name + " has a " + car + " of year " + year);
		 
		 // Concatenation of a String with an integer
		 
		 System.out.println("BMW of year " + "2020");
		 System.out.println("BMW of year " + 2020);
		 System.out.println(car + " of year " + year );
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
