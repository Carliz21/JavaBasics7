package com.syntax.class04;

public class NestedIfContinues {
	public static void main(String[] args) {
		// check if patient has allergies
		// if no allergies --> You're healthy
		//otherwise :
		// if peanut allergy -- Don't eat peanut.
		//Lactose allergy = Don't drink milk.
		// Bee allergy --> Don't mess with bees. 
		
		boolean allergies = true;
		boolean peanut = true;
		boolean lactose =false;
		boolean bee= true;
		
		if (!allergies) { // No allergies
			System.out.println("You're healthy!");	
		} else { // Which allergies
			if (peanut) {
				System.out.println("Don't eat peanut!");
			}
			
			if (lactose) {
				System.out.println("Don't drink milk!");
			}
			
		     if (bee) {
				System.out.println("Don't mess with bees!");
			}
			
		}
		
		
		}
		
			
	
}
