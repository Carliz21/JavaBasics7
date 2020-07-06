package com.repl.excercises;

public class Repl106 {

	public static void main(String[] args) {
		StringBuffer string = new StringBuffer("Hello ");
		string.append("Friends");
		System.out.println(string);
		String back="";
		
		for (int i=string.length ()-1; i>=0;i--) {
			
			
			back += string.charAt(i);
			
		}
		System.out.println(back);

		
	}
}