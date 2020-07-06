package com.syntax.class08;

import java.util.Scanner;

public class Lottery {
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		int lottery =17;
		int num;
		
		do {
		 System.out.println("Please enter a number from 1-20:");
		 num=input.nextInt();
		
		}while (num != lottery); 
		
			System.out.println("Congrats you won!");
		}
		
			
		
		
	}


