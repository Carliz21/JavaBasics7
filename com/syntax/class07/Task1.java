package com.syntax.class07;

public class Task1 {
	public static void main(String[] args) {
		int a =50;
		
		while (a >=1) {
			System.out.println(a);
			a--;
		}
		
		System.out.println("---------------ODD----------------------------");
		//1,3,5,7,9,11,13,15,17,19
		
		// 1st way
		int b = 1;
		while (b < 20) {
			if (b % 2 == 1) {
				System.out.println(b);
			} b++;
		}
		
		
		// 2nd way
		int c=1;
		while (c < 20) {
			System.out.println(c);
			c+=2;
				
		}
		
		
	}

}
