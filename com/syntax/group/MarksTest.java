package com.syntax.group;

public class MarksTest {
	
	public static void main(String[] args) {
		
		Marks a= new StudentA (85.3, 78.3 ,89.0);
		System.out.println(a.getPercentage());
		
		Marks b= new StudentB (100.0, 99.3,89.9,97.6);
		System.out.println(b.getPercentage());
		
		
		
	}

}
