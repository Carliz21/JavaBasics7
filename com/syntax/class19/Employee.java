package com.syntax.class19;

public class Employee {
	
	public static String company; // any class from any package in the project
	public String name , lastName;// any class from any package in the project
	protected int age; // if you class within same package you can access all protected members
	double salary; // default (same as protected)
	private long ssn;// only it's own class/same can have access to private members
	
	
	public static void displayCompany () {
		System.out.println("Employee works at " +company);
	}
	
	public void displayName () {
		System.out.println("Employee name is " +name + " " + lastName);
	}
	
	protected void displayAge() {
		System.out.println("Employee is " + age+ " years old");
	}
	
	void displaySalary() {
		System.out.println("Employee's salary is " + salary);
	}
	
	private void displaySSn () {
		System.out.println("Employee's ssn is " + ssn);
	}
	
	public static void main(String[] args) {
		company="Google";
		
		Employee emp = new Employee ();
		emp.name="Michael";
		emp.lastName="Smith";
		emp.age=21;
		emp.salary=90000;
		emp.ssn=123456789;
		
		emp.displayName();
		emp.displayAge();
		emp.displaySalary();
		emp.displaySSn();
		
		
	}

}
