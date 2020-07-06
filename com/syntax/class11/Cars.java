package com.syntax.class11;

public class Cars {
	
	public static void main(String[] args) {
		
		// Create an array of cars : american, german, korean, italian. 
		//Then retrieve all values from that array using 2 different loops
		
		
		String [] cars={ "Ford","Volkswagen", "Kia","Fiat"};
		
		 for (String carMake:cars) {
			 System.out.print(carMake + " ");
		 }
		 
		 System.out.println();
		 System.out.println("-------------------------------------");
		 
		 for (int i=0; i < cars.length; i++) {
			 System.out.print(cars[i] + " ");
		 }
		
		
		
	}

}
