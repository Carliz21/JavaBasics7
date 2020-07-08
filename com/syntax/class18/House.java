package com.syntax.class18;

public class House {

	public static void main(String[] args) {

		Cat cat1 = new Cat();
		cat1.name = "Jessy";
		cat1.color = "grey";
		cat1.age = 8;
		// to access static variables we use name of class and 
		System.out.println("Number of paws=" + Cat.paws);

		Cat cat2 = new Cat();
		cat2.name="Lucy";
		cat2.age=1;
		cat2.color= "white";
		cat2.name="Bonchuk";
		cat2.mustache= false;//possible way but not the right way
		Cat.tail=false;
		
		System.out.println("Name of 1st cat= " + cat1.name);
		
		System.out.println("Name of 2nd cat= " + cat2.name);
		
		cat1.displayCat();
		cat1.displayCommonFeatures();
		cat2.displayCat();
		cat2.displayCommonFeatures();
		
		Cat cat3= new Cat();
		cat3.name= "Kathy";
		cat3.age=4;
		cat3.color="black";
		
		cat3.displayCat();
		cat3.displayCommonFeatures();

	}

}
