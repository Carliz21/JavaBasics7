package com.repl.excercises;

import java.util.Scanner;

public class Repl104 {
	public static void main(String[] args) {
		// John
		// Jane
		// Jimmy
		// Mike
		// Emily

		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter names");
			arr[i] = input.nextLine();

		}

		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i].substring(0,3));
		}
	}

}
