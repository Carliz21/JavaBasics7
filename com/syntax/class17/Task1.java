package com.syntax.class17;

public class Task1 {

	public static void main(String[] args) {

		Task1 obj = new Task1();
		
		String email = obj.createEmail("carmen", "ferrufino", "gmail");
		System.out.println(email);
		
		
		boolean prime = obj.isPrime(5);
		System.out.println(prime);

	

		char grade = obj.getGrade(88);
		System.out.println(grade);

	}

	// 1.Create a method createEmail(). Based on values of users name, lastName and
	// email type, your method should return complete email Address. Example:
	// createEmail(John, Snow, gmail) → johnsnow@gmail.com
	// 2.Write a method to return whether given number is prime or not?
	// 3.Create class Student that will have a method getGrade.
	// Your method should accept the score of a student and return a grade:
	// score > 90 - A ,score >80 - B, score >70 - C , score > 50 - else - F
	

	String createEmail(String name, String lastName, String emailType) {
		String mail = name + lastName + "@" + emailType + ".com";
		return mail.toLowerCase();

	}

	boolean isPrime(int a) {
		boolean prime;
		if (a % 2 == 1) {
			prime = true;
		} else {
			prime = false;
		}
		return prime;
	}

	char getGrade(int a) {
		char grade;

		if (a > 90) {
			grade = 'A';
		} else if (a <= 90 && a > 80) {
			grade = 'B';
		} else if (a <= 80 && a > 70) {
			grade = 'C';
		} else if (a <= 70 && a > 50) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		return grade;
	}

}
