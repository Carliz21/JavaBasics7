package com.syntax.class21;

public class ConstructorTest {

	ConstructorTest(){
		this(1);
		System.out.println("Hi");
	}

	ConstructorTest(int x){
		this(1,2);
		System.out.println("Hello");
	}

	ConstructorTest(int x, int y){
		System.out.println("How are you");
	}

	public static void main(String[] args) {

		System.out.println();
		ConstructorTest obj = new ConstructorTest();

	}

}
