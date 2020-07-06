package com.syntax.class09;

public class Patterns {

	public static void main(String[] args) {
		// I want to print this pattern
		// *****
		// *****
		// *****
		// *****
		//

		System.out.println("------------------Silly way, Not nested loop------");
		for (int i = 1; i <= 4; i++) {
			System.out.println("*****");
		}

		System.out.println(" -------- First Way--------------");

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		System.out.println("-----------Task Pattern 10x10------------");
		
		for (int row = 1; row <= 10; row++) {
			for (int column = 1; column <= 10; column++) {
				System.out.print("$");
			}
			System.out.println();
		}
		
		
	}

}
