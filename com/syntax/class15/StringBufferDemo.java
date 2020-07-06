package com.syntax.class15;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		
		System.out.println("-------------This is a mutable object----------------------------");
		
		StringBuffer strBuffer= new StringBuffer("Hello");
		strBuffer.append(" friends");// when we performed operation happens on same object and No new object gets created
		System.out.println(strBuffer); // Hello friends
		
		
		System.out.println("------------Unchangeable-------------------------------------------");
		
		String str1="Hello";
		str1.concat(" friends");
		System.out.println(str1);
		
		
		System.out.println("---------------Example-----------------------------------------------");
		StringBuffer sentence= new StringBuffer("I have class today.");
		sentence.append(" It is a Java class.");
		System.out.println(sentence);
		
		
		
		
	}

}
