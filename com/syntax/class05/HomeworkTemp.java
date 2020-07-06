package com.syntax.class05;

import java.util.Scanner;

public class HomeworkTemp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter your city!");
	String city= scan.nextLine();
	
	System.out.println("Please enter the temperature in Farenheit!");
	int tempF = scan.nextInt();
	
	int tempC= (tempF - 32) * 5 / 9;
	System.out.println(" The temperature in Celcius of the city " + city + " is " + tempC);
	
}
}
