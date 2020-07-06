package com.syntax.class13;

public class DogTypes {
	
	public static void main(String[] args) {
		
		Dog dog1= new Dog ();
		dog1.dogBreed = "Husky";
		dog1.color="white and gray";
		dog1.name= "Bingo";
		dog1.gender="male";
		dog1.age=2;
		
		System.out.println("Breed of first dog is a: " + dog1.dogBreed + " and his name is "+ dog1.name);
		dog1.walk();
		dog1.run();
		dog1.houseDog();
		dog1.playful();
		
		Dog dog2= new Dog ();
		dog2.dogBreed = "Bulldog";
		dog2.color="white";
		dog2.name= "Polo";
		dog2.gender="male";
		dog2.age=2;
		
		System.out.println("Breed of second dog is a: " + dog2.dogBreed + " and his name is " 
		+dog2.name);
		dog2.walk();
		dog2.run();
		dog2.houseDog();
		dog2.playful();
		
		Dog dog3= new Dog ();
		dog3.dogBreed = "Labrador";
		dog3.color="black and gray";
		dog3.name= "Congo";
		dog3.gender="male";
		dog3.age=2;
		
		System.out.println("Breed of third dog is a: " + dog3.dogBreed + " and his name is " + dog3.name);
		dog3.walk();
		dog3.run();
		dog3.houseDog();
		dog3.playful();
		
		
		
		
		
		
		
	}

}
