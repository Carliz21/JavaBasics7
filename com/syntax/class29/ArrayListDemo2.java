package com.syntax.class29;

import java.util.ArrayList;

public class ArrayListDemo2 {
	
	public static void main(String[] args) {
		
		//Create an ArrayList that will store numbers
		ArrayList<Integer> alist=new ArrayList<>();
		alist.add(100);//0
		alist.add(200);//1
		alist.add(300);//2
		
		System.out.println("Size of alist= " + alist.size());
		System.out.println(alist);
		
		alist.add(1);//3
		alist.add(2);//4
		System.out.println("List of Array after adding two more numbers= "+ alist);
		
		alist.remove(2);// specifying index
		System.out.println("After removing element with index 2= " +alist);
		
		
		
		
	}
	

}
