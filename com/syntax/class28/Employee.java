package com.syntax.class28;

public class Employee {

	public String lastName, title;
	
	// make variables as private
	private double salary;
	private int age, empId;
	
	public Employee(String lastName, String title) {
		this.lastName=lastName;
		this.title=title;
	}

	// create public methods (getters and setters) to give access to private
	// variables

	// creating getters
	public double getSalary() {
		return salary;

	}

	public int getAge() {
		return age;
	}

	public int getEmpId() {
		return empId;
	}

	// creating setters

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setAge(int age) {
		if (age > 16) {
			this.age = age;
		}

	}

	public void setEmpId(int empId) {
		if(empId>0)
		this.empId = empId;
	}

}
