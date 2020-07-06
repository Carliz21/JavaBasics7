package com.syntax.class14;

public class School {
	
	public static void main(String[] args) {

		Student student = new Student();
		student.name = "John";
		student.lastName="Doe";
		student.grade= 'A';
		student.studentId=45678;
		student.study();
		
		Student student2= new Student ();
		student2.name="Jane";
		student2.lastName="Smith";
		student2.study();
		
		
		

	}

}
