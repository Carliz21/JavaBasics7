package com.syntax.class04;

public class MoreNested {
	public static void main(String[] args) {
		// Let's have a date of month and a day of week
		// if it's Friday-->
		// if date is 13 --> Watch a scary movie.
		// if date is not 13 --> Watch a comedy.
		// if it is not Friday --> We are going to study JAVA.
		
		boolean isFriday= true;
		int date = 31;
		
		if (isFriday) {
			System.out.println("It's Friday. I am going to watch a movie!");
			if (date == 13) {
				System.out.println("I will watch a scary movie.");
			}else {
				System.out.println("I will watch a comedy.");
			}
			
		} else {
			System.out.println("We are going to study JAVA.");
		}
		
	}

}
