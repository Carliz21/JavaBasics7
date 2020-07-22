package com.syntax.class25;

public class StudentTest {

	public static void main(String[] args) {

		SyntaxStudent syntax = new SyntaxStudent();
		syntax.inLoveWithJava();
		syntax.study();
		syntax.sleepy();

		CollegeStudent col = new CollegeStudent();
		col.read();
		col.study();
		col.sleepy();

		System.out.println("--Creaing an object of college but give reference to Student class");
		Student obj = new CollegeStudent();
		obj.sleepy();
		obj.study();

		System.out.println("--Creaing an object of syntax  but give reference to Student class");
		Student ss = new SyntaxStudent();
		ss.study(); // runtime polymorphism
		ss.sleepy(); // runtime polymorphism
		

		System.out.println("--Creaing an object of school but give reference to Human class");
		Human obj2= new SchoolStudent();
		obj2.happy();
		obj2.study();
	}
}
