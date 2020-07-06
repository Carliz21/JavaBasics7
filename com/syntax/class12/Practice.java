package com.syntax.class12;

public class Practice {
	public static void main(String[] args) {

		int[][] arr = { { 8, 3, 6, 4 }, { 5, 6, 4, 3 }, { 5, 2, 4, 4, 2 } };

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				if (arr [i][j] % 2 != 0) {
					int sum= arr[i][j];
					int count = sum;
					System.out.println(count);
			
				}

			}

		}

	}
}
