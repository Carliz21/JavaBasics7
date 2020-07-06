package com.syntax.class12;

public class ArrayRecap {

	public static void main(String[] args) {

		String [] colors = new String[3];
		colors[0] = "red";
		colors[1] = "blue";
		colors[2] = "white";
		
		System.out.println(colors.length);
		
		for (int i= 0; i < colors.length; i++) {
			String color=colors[i];
			System.out.println(colors[i]);
		}
		
		
		
		System.out.println("------------------------------------------------");
		
		// advanced for loop
		
		for (String c:colors) {
			System.out.println(c);
		}
		
		
		

	}

}
