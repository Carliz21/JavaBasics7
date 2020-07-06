package com.syntax.class16;

public class MethodsWithReturnValue {
	
	public static void main(String[] args) {
		
		// Create a String and based on the number of characters define whether
		// String is long or short
		// long if length > 10, short if less
		
		String str="I love Java";
		
		int length=str.length();
		if (length >=10) {
			System.out.println("Created a large String");
		}else {
			System.out.println("Created a short String");
		}
		
		// define which number is the largest and then define whether this largest number is even or odd
		
		Task1 obj=new Task1();
		obj.larger(10, 20);	
		
	}
	
	
	
	
	

}
