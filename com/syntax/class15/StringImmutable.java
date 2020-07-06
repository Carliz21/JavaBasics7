package com.syntax.class15;

public class StringImmutable {
	
	public static void main(String[] args) {
		
		String str="Today is a good day"; 
		
		str=str.replace("good", "amazing"); // new object gets created and the object str gets reassigned
		
		System.out.println(str);
		
		str.concat(".I love Sundays");  // Strings are immutable--> unchangeable
		
		System.out.println(str); // original str did not get changed
		
		String str1= new String ("Hello");
		str1.toUpperCase();
		
		System.out.println("-----Value of str1=" + str1);
		
		String str2="Hello";
		String str3="Hello";
		String str4="Hello";
		
		System.out.println("--------Still will print hello because has not been reassigned-----");
		str2.toUpperCase();
		System.out.println("Value of str2=" + str2);
		
		System.out.println("----------- After getting reassigned--------");
		str2=str2.toLowerCase(); // str2 is getting reassigned
		System.out.println("Value of str2 after asssignment= " + str2);
		
		System.out.println("----------Str3 and Str4 have not been reassigned--------------");
		System.out.println("Value of str3="+ str3);
		System.out.println("Value of str4=" + str4);
		
		
		
		
	}

}
