package com.syntax.class11;

public class RetrievingValuesFromTwoDArrays {

	public static void main(String[] args) {
		// Put the months for each season in one row

		String[][] months = { 
				{ "December", "January", "February" }, // 1st row
				{ "March", "April", "May" },// 2nd row
				{ "June", "July", "August" }, // 3rd row
				{ "September", "October", "November" } //4 rows

		};

		int rows = months.length; // how many arrays are inside, how many rows?
		System.out.println(rows + " rows");

		int winterLength = months[0].length; // how many elements/columns are in row with index 0?
		System.out.println(winterLength + " months in row with index 0");
		
		int lastRowSize=months[rows-1].length;
		
		for (int row=0 ; row <months.length;row++) { //iterating over rows
			
			for (int column=0; column < months[row].length; column++) { //iterating over columns
				System.out.print(months[row][column] + " ");
				
			}
			System.out.println();
		}

	}

}
