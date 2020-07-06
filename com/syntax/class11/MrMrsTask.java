package com.syntax.class11;

public class MrMrsTask {
	
	public static void main(String[] args) {
		
		String [][]names = {
				
				{"Mr", "Mrs", "Ms", "Miss"},
				{"Smith", "Jordan", "Jackson", "Obama"}
							
		};
		
		System.out.print(names[0][1] + "." + names[1][1] +  ",");
		
		System.out.print( names[0][0] + "." + names[1][3] +  ",");
		
		System.out.print( names[0][2] + "." + names[1][2] +  ",");
		
		System.out.print( names[0][3] + "." + names[1][1] +  ",");
		
		System.out.println();
	
		
	}

}
