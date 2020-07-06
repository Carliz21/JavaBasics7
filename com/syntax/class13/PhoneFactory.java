package com.syntax.class13;

public class PhoneFactory {
	public static void main(String[] args) {
		
		Phone phone1=new Phone ();
		phone1.make="iPhone";
		phone1.model=11;
		phone1.color="black";
		
		System.out.println("Make of first phone is: " +phone1.make);
		phone1.call();
		phone1.messages();
		phone1.camera();
	
		
		Phone phone2=new Phone ();
		phone2.make="Nokia";
		phone2.model=11;
		phone2.color="blue";
		
		System.out.println("Make of second phone is: " +phone2.make);
		phone2.call();
		phone2.messages();
		phone2.camera();
		
		
		Phone phone3=new Phone ();
		phone3.make="Android";
		phone3.model=11;
		phone3.color="red";
		
		System.out.println("Make of third phone is: " +phone3.make);
		phone3.call();
		phone3.messages();
		phone3.camera();
		
		
		
		
	}

}
