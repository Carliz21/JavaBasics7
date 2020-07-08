package com.syntax.class18;

public class EmployeeDemo {
	
	int empId;
	int salary;
	
	static String CEO="Sumair";
	
	public static void main(String[] args) {
		
		
		System.out.println(Employee.CEO);
		
		System.out.println(CEO);
		
		
	}
	
	static void sayHelloToCeo () {
		System.out.println("Hi " + CEO);
	}

}
