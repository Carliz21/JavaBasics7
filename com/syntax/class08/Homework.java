package com.syntax.class08;

public class Homework {

	public static void main(String[] args) {
		// Print numbers 100-1
		for (int i = 100; i >= 1; i--) {
			System.out.println(i);
		}

		// Print numbers 1,2,3

		for (int b = 1; b <= 3; b++) {
			System.out.println(b);
		}

		// Print odd numbers from 20 and 50

		for (int i = 20; i <= 50; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}

			//2nd way
		for (int c = 21; c < 50; c += 2) {
				System.out.println(c);
			}
		
		
		int total=1;
		for (int k=1; k<=4; k++) {
			total= total + k;
		}
		System.out.println(total);
		

		}

	}

}
