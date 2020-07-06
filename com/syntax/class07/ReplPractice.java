package com.syntax.class07;

public class ReplPractice {
	public static void main(String[] args) {

		// print even numbers with for loop

		for (int i = 10; i > 0; i -= 2) {
			System.out.println(i);
		}
		System.out.println("---------------------------------------");

		for (int i = 2; i <= 14; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		System.out.println("----------------------------------------");

		for (int i = 5; i < 22; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}

		System.out.println("------------------------------------------------");

		int result;
		int mult = 3;

		for (int i = 1; i <= 10; i++) {
			result = mult * i;
			System.out.println(mult + "*" + i + "=" + result);
		}
		System.out.println("-----------------OR----------------------");

		int num = 3;

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "*" + i + "=" + num * i);
		}

		System.out.println("-----------------------------------");

		for (int i=1;i <=10; i++) {
			
			if (i==5 && i==6) {
				continue;
			}
			System.out.println(i);
		}
		
		
	}
}
