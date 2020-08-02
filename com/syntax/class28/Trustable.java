package com.syntax.class28;

abstract class Mortgage {

	protected abstract void givesMortgage();
}

public interface Trustable {

	void trust();

}

interface Investments {

	void doInvestments();
}

interface Bank extends Trustable {
	
	boolean MONEY=true;

	void deposit();

	void withdraw();
	
	// From Java 8 inside interface we can have default methods and static
	default void wires () {
		System.out.println("All banks will allow you to do wires");
	}
	
	static void checkCreditScore() {
		System.out.println("All banks will check credit score before lending money");
	}

}

class PNC extends Mortgage implements Bank, Investments {

	public void deposit() {
		System.out.println("At PNC you can deposit your money using several options");

	}

	public void withdraw() {
		System.out.println("At PNC you can withdraw your money using several options");

	}

	public void trust() {
		System.out.println("You can trust PNC with your money");

	}

	public void givesMortgage() {
		System.out.println("PNC gives options for mortgages");
	}

	public void doInvestments() {
		System.out.println("PNC also gives several options for Investments");
	}

}

class BOA implements Bank {

	public void deposit() {
		System.out.println("At BOA you can deposit money by several options");
	}

	public void withdraw() {
		System.out.println("At BOA you can withdraw money by several options");
	}

	public void trust() {
		System.out.println("You can trust BOA with your money");

	}
}
