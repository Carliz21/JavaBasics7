package com.bucky.practice;

import java.util.Scanner;

public class ReplPositive {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please entere your gender : M or F");
		boolean isFemale=input.hasNextBoolean();
		
	    System.out.println("Please enter your age");
	    int age= input.nextInt();
	    
	    
	    if (age >=25) {
	    	if (isFemale) {
	    		System.out.println("Woman");
	    	} else {
	    		System.out.println("Man");
	    	} if (age <=25) {
	    		
	    		if(isFemale) {
	    			System.out.println("Girl");
	    		} else {
	    			System.out.println("boy");
	    		}
	    		
	    		
	    	}
	    }
	  
	 
	    		
	   
	    

	}
}