package com.syntax.class11;

public class Recap {

	public static void main(String[] args) {

		int[] grades = new int[5]; // this cannot be changed later

		int size = grades.length;
		System.out.println(size);

		grades[4] = 90;
		grades[3] = 85;
		grades[2] = 92;
		grades[1] = 75;
		grades[0] = 100;
		
		
		// what is the average of the class?
		
		int average = (grades[0]+ grades[1]+ grades[2]+ grades[3]+ grades[4] )/ size;
		System.out.println("Class average is : " + average);
		
		int total=0;
		for (int k =0; k<5;k++) {
			total +=grades[k];
		}
		System.out.println("Class averare is :" + total/5);
		
		
		System.out.println("---------------------------------------------------");
		
		String [] cities= {"Fairfax", "Kiev", "Tampa", "Washington", "Arlington", "NYC",
				"Lorton", "Chicago"};
		// I live in Tampa
		System.out.println("I live in " + cities[2]);
		
		int i=1;
		System.out.println("I live in " + cities[i]);
		
		
		i += 2;
		System.out.println("I moved to " + cities [i]);
		
		int cityLength = cities.length;
		System.out.println("Total number of cities is: " + cityLength);
		
		System.out.println("The last city on the list is: " + cities[cityLength-1]);
		
		
		System.out.println("-----------------------------------------------");
		
		// I want to print all the cities
		// cities [0], cities[],....cities[7]
		
		for (int j = 0 ; j < 8; j++) {
			System.out.println(cities[j]);
			
		}
		
		
		

	}

}
