package com.syntax.class18;

public class Employee {
	
	int empId;
	long salary;

	static String CEO= "Sumair";
	
	void info() {
		System.out.println("The employee's ID is " + empId + " and their salaray is " + salary + " and their CEO is " + CEO); 
	}
	
	
	
	
	public static void main(String[] args) {
		
		Employee employee1= new Employee ();
		employee1.empId= 3456;
		employee1.salary=70000l;
		employee1.info();
		
		
		Employee employee2= new Employee();
		employee2.empId=3457;
		employee2.salary=50000l;
		employee2.info();
		
		
		
		
		
		
		
	}
	
	

}
