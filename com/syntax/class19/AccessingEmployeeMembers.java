package com.syntax.class19;

public class AccessingEmployeeMembers {
	
	public static void main(String[] args) {
		
		Employee emp= new Employee();
		emp.name= "John";
		emp.lastName= "Smith";
		emp.age= 35;
		emp.salary=90000;
		//emp.ssn--> wont be available because it's private 
		
		emp.displayName();
		emp.displayAge();
		emp.displaySalary();
		//emp.displaySsn(); --> won't be available because it's private 
		
		
	}

}
