package com.syntax.class03;

public class TemperatureCheck {
	public static void main(String[] args) {
		
	int temp1 =32;
	
	int temp2 = 88;
	
	if (temp1 < temp2) {
		System.out.println("Water will freeze with temperature "  +  temp1);
	}else {
		System.out.println("Water will Not freeze with temperature" + temp2);
	}
	
	int temp3= 45;
	
	if (temp3<32) {
		System.out.println("Water will freeze with temperature " + temp3);
	}else {
		System.out.println("Water will NOT freeze with temperature " + temp3);
	}
	}

}
