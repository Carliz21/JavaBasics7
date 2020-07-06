package com.syntax.class07;

public class IncrementDecrement {
	public static void main(String[] args) {
		// only increase/decrease by 1!!!!
		// ++ (increase/increment) by 1
		// -- (decrease/decrement) by 1
		// increment/decrement operators will be used with loops
		int x = 10;
		x = x + 1;
		x += 1;
		// another way to add 1 into variable
		x++; // post-increment --> first print, then increase
		++x; // pre-increment --> first increase,then print

		System.out.println(x);

		int y = 50;
		y = y - 1;
		y -= 1;
		y--;

		System.out.println(y);
		
		int z =40;
		z++;
		
		System.out.println(z);
		
		int k = 10;
		if (k++== 11) { // post-increment --> will not print line <-- but if ++k (pre-increment) will print line.
			System.out.println("Neal was here");
		}

	}

}
