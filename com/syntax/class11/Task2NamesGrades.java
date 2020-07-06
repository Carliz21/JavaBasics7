package com.syntax.class11;

public class Task2NamesGrades {

	public static void main(String[] args) {
		
		// Create a 2D array with first row contain 4 names 
		// Second row will contain grades
		//Program should print names of student that have a A and B grade

		String[][] names = {

				{ "George", "Trinity", "Travis", "Carmen" }, { "A", "B", "C", } };

		System.out.println(names[0][0] + "'s"+ " grade in this class is an  " + names[1][0]);
		System.out.println(names[0][1] + "'s" + " grade in this class is an  " + names[1][1]);
		System.out.println(names[0][3] + "'s" + " grade in this class is an  " + names[1][0]);
		
	}

}
