package com.syntax.class21;

public class AnimalsTest {
	
	public static void main(String[] args) {
		//object of parent class has an access to all var and methods of its own class
		Animal a= new Animal();
		a.breed="Husky";
		a.color="white";
		a.paws=4;
		
		a.sleep();
		a.eat();
	
		System.out.println("---------------------Dog-----------------------------------------");
		// object of child class has an access to all var and methods of its parent class and it's own
		Dog dog = new Dog();
		dog.breed="Husky";
		dog.color="White and Grey";
		dog.paws=4;
		dog.tail=true;
		
		dog.eat();
		dog.sleep();
		dog.bark();
	
		System.out.println("---------------------------Cat------------------------------------");
		Cat cat= new Cat();
		cat.breed="Persian";
		cat.color="White";
		cat.fur="Soft";
		cat.paws=4;
		cat.tail=true;
		
		cat.purr();
		cat.eat();
		cat.sleep();
		
	}

}
