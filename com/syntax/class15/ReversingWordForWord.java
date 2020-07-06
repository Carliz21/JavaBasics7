package com.syntax.class15;

public class ReversingWordForWord {

	public static void main(String[] args) {

		String str = "Today is sunny";

		String[] array = str.split(" ");

		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}

	}

}