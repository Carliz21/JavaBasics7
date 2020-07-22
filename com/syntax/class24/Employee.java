package com.syntax.class24;

public class Employee {

	double salary;

	void getPaid() { //overridden method
		System.out.println("Employee gets paid a salary of = " + salary);
	}

}

class Contractor extends Employee {

	double hourlyRate;

	void getPaid() { // overriding method
		System.out.println("Contractor gets paid an hourly rate of = " + hourlyRate);
	}

}

class FullTimeEmployee extends Employee {

}

class PartTimeEmployee extends Employee {

}
