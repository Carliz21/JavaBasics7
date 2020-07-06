package com.syntax.class07;

public class WhileVsDoWhile {
	public static void main(String[] args) {

		// do while vs while :
		// do while--> executes the code , then checks/tests the condition
		// while --> checks/test the condition, then executes the code
		//
		//
		// print hello 3 times using while loop - below:

		int x = 1;
		while (x <= 3) { // checks before going into the loop
			System.out.println("Hello");
			x++;
		}

		System.out.println("------------------------Using Do While Loop----------------------------------");

		int y = 1;

		do {
			System.out.println("Hello"); // checks after going into the loop 
			y++;
		} while (y <= 3);

	}
	
	

}
