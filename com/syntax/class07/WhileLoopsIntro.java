package com.syntax.class07;

public class WhileLoopsIntro {
	public static void main(String[] args) {
		int time = 10;
		// this will execute one time
		if (time < 12) {
			System.out.println("Good Morning!");
		}

		System.out.println("-------------------- While Loop--------------------");

		// This code will execute infinitely : (below) but we can fix it by adding
		// time++
		// while (time < 12) {
		// System.out.println("Good morning!");
		// time++;

		// this code will not execute: (below)
		// while (time >12){
		// System.out.println("Good Morning!");
		// time--;

		while (time < 12) {
			System.out.println("Hi");
			time++;
		}

		// print numbers from 1-50
		int num = 1;

		while (num <= 50) {
			System.out.println(num);
			num++;
		}
		// print numbers from 20-30
		int num1 = 20;

		while (num1 <= 30) {
			System.out.println(num1);
			num1++;
		}
		
		int y =5;
		
		while (y <= 15) {
			System.out.print(y + ",");
			y++;
		}
		
		System.out.println();// print nothing and move to next line
		System.out.println("---------------------------------------");
		
		// how to print numbers from 10 to 1?
		
		int a= 10;
		
		while (a >= 1) {
			System.out.println(a);
			a--;
		}
		

	}

}
