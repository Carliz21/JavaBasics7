package com.syntax.class26;

public class PhoneTest {
	
	public static void main(String[] args) {
		
		//Phone phone= new Phone ();CE--> we cannot create an object of Abstract class
		
		Phone iphone =new iphone ();
		iphone.makeCall();
		iphone.sentText();
		iphone.playMusic();
		iphone.navigate();
		
		Phone samsung= new Samsung ();
		samsung.makeCall();
		samsung.sentText();
		samsung.playMusic();
		samsung.navigate();
	
		
		
	}

}
