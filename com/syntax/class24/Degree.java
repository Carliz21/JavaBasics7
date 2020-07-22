package com.syntax.class24;

public class Degree {

	void getPrerequisite() {
		System.out.println("To get a degree you need high school diploma");
	}

}

class Bachelors extends Degree {

	void getPrerequisite() {
		System.out.println("To get a degree you need high school diploma");
	}
}

class Masters extends Degree {

	void getPrerequisite() {
		System.out.println("To get a masters degree you need a Bachelors diploma");
	}
}