package com.syntax.class09;

public class PrintHours {

	public static void main(String[] args) {

		// Let us print the clock 0:00 
		//  0:01
		// ....
		// 1:00 
		//1:01 
		//... 
		// 23:58 
		//23:59 
		//Hours goes 0 to 23
		// Minutes goes from 0 to 59

		for (int h = 0; h < 24; h++) {

			for (int m = 0; m < 60; m++) {
				System.out.println(h + ":" + m);
			}

		}

	}

}
