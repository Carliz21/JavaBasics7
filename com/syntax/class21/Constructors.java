package com.syntax.class21;

public class Constructors {
	
	String word;
	
	public Constructors() {
		System.out.println("I am a non argument constructor");
	}
	
	public Constructors(String word) {
		this (12, word);// if this () is used must always must be first statement in constructor
		this.word=word;
		System.out.println("I am a parameterized constructor with str = " + word);
	}
	
	public Constructors ( int num){
		System.out.println("I am a constructor with 1 parameter = " + num);
	}
	
	public Constructors ( int num, String word){
		System.out.println("I am a constructor with 2 parameter = " + num+ " and "+word);
	}
	
	public static void main(String[] args) {
		
		Constructors obj= new Constructors("Java");
		System.out.println(obj.word);
	}

}
