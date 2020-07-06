package com.syntax.class03;

public class CompoundOperators {
	public static void main(String[] args) {
		int num = 100;
		num = num + 100; //200
		System.out.println(num);
		
		num = num + 100;
		System.out.println(num);
		
		// We can use compound operators which are shorter 
		num += 100;
		System.out.println(num);//400
		
		//long way 
		//num = num - 50;
		
		//short way 
		num -= 50;
		System.out.println(num);
		
		num /= 7;
		System.out.println(num);
		
		// num = num * 2; (long way)
		num *= 2;
		System.out.println(num);
		
		//num = num % 9;
		
		num %= 9;
		System.out.println(num);
		
		
		
	}

}
