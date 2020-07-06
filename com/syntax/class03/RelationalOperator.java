package com.syntax.class03;

public class RelationalOperator {

	public static void main(String[] args) {

		// comparison operators --> relational operators
		// > greater than
		// < less than
		// >= greater than or equal to
		// <= less than or equal to
		// == equal to
		// != not equal

		int a = 7;
		int b = 10;

		System.out.println(3 > 4);

		System.out.println(a > b);// greater than
		System.out.println(a < b);// less than
		System.out.println(a == b);// two equal signs equal to
		System.out.println(a != b); // is a different from b?

		double i = 10.78;
		double j = 10.78;
		boolean result1 = i > j;// is greater than
		System.out.println(result1);

		boolean result2 = 1 == j; // is equal to
		System.out.println(result2);

		boolean result3 = i != j;// is i different from j
		System.out.println(result3);

		boolean result4 = i >= j; // is i greater or equal to
		System.out.println(result4);

		boolean result5 = i <= j; // is i smaller than or equal to
		System.out.println(result5);
		
		

	}
}
