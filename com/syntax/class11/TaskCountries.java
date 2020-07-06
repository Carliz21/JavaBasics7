package com.syntax.class11;

public class TaskCountries {

	public static void main(String[] args) {
		
		// Create an array of countries: north america countries, south america countries,
		// europe countries, asian countries, african countries. 
		//hen print all values from that array using 2 different loops 
		//and calculate how many total countries been stored.
		
		
		String [][] countries = {{"USA", "Canada","Mexico"},{"Venezuela", "Columbia", "Brazil"},
		{"Italy", "France", "Spain"},  {"China","Japan", "Vietnam"},{"Ghana","Ethiopia", "South Africa"}};
		
		
		for (int i= 0 ; i <countries.length; i++) {
		  for (int j =0; j < countries[i].length; j++) {
			  System.out.print(countries[i][j] + " , ");
		  }
		
		
		}
		
		System.out.println();
	
		for (String [] country:countries) {
			for (String country1:country) {
				System.out.print(country1 + " ");
			}
		}
		
		int rows=countries.length;
		int cols = countries[0].length;
		int sum=rows*cols;
		System.out.println();
		System.out.println("The total number of countries listed are : " + sum );

		
		
		}
		

		
		
		
		
		
	}
	
	

