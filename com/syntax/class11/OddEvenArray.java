package com.syntax.class11;

public class OddEvenArray {

	public static void main(String[] args) {

		int[][] numbers = {

				{ 2, 23, 30, 38 }, { 3, 20, 45, 87 }, { 99, 100, 36, 54 } };

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j] % 2 == 0) {
					System.out.print(numbers[i][j]+ ",");
				}
			}
		}

	}

}
