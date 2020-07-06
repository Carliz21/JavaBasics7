package com.syntax.class08;

public class SkipNumbers {
	public static void main(String[] args) {

		// I want to print from 1-10
		// But I want to skip 5,6,7

		for (int i = 1; i < 11; i++) {
			if (i == 5 || i == 6 || i == 7) {
				continue;
			}
			System.out.println(i);
		}

		// We want to print numbers from 1-100
		// But we want to skip numbers between 35 and 55

		for (int i = 1; i <= 100; i++) {
			if (i >= 35 && i <= 55) {
				continue;
			}
			System.out.println(i);

		}

	}

}
