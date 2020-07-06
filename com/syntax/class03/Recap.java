package com.syntax.class03;

public class Recap {

	public static void main(String[] args) {
	 int num1 =10 + 10 * 10;
	 System.out.println(num1);

	 int num2 =(10 + 10) * 10;
	 System.out.println(num2);
	 
	 int num3 = 10 * 10 + 10 / 10;
	 System.out.println(num3);
	 
	 
	 int a = 10;
	 int b = 20;
	 
	 
	 String x = "Java";
	 String y = "Sunday";
	 
	 System.out.println(a + b + x + y);
	 System.out.println(a + x + y + b);
	 System.out.println(x+y+a+b);// start from left 
	 
	 //JavaSunday30
	 System.out.println( x + y + (a + b));// use parenthesis because of order of operations
	 
	 //If I want 1020JavaSunday
	  System.out.println(a + "" + b + x + y);
	  System.out.println(a + (b + x + y));
	 
	}

}
