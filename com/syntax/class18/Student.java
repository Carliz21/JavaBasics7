package com.syntax.class18;

public class Student {
	
	//Create a Class called Students
	//Create three  variables  studentName , studentID  and  numberOfStudents
	//Create three objects of the Students Class 
	//Set the value for  studentName , studentID and increment  the numberOfStudents for each object
	//Print out  total number of students
	
	
	String studentName;
	int studentID;
	
	static int numberOfStudents= 0;
	
	
	
	public static void main(String[] args) {
		
		Student s1= new Student();
		s1.studentName ="Paul";
		s1.studentID= 3454;
		numberOfStudents++;
	
		
		Student s2= new Student();
		s2.studentName= "Cathy";
		s2.studentID=3455;
		numberOfStudents++;
		
		
		Student s3= new Student();
		s3.studentName="George";
		s3.studentID=3456;
		numberOfStudents++;
		
		
		System.out.println(Student.numberOfStudents);
		
		
		
		
		
	}
	
	
	


}
