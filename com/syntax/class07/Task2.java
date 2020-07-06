package com.syntax.class07;

public class Task2 {
	public static void main(String[] args) {

		boolean isWorkday = true;
		int day = 1;

		while (isWorkday) {
			if (day < 6) {
				System.out.println("I need a day off");
				day++;
			} else {
				System.out.println("I do not nned a day off any more");
				isWorkday=false;
			}

		}
	}
}
