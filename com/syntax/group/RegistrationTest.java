package com.syntax.group;

public class RegistrationTest {

	public static void main(String[] args) {
		RegistrationClass r = new RegistrationClass();
		r.setEmail("yahoo");
		r.enterEmail(r.getEmail());
		r.setUserName("Carmen21");
		r.enterUserName(r.getUserName());
		r.setPassword("Carmen0621");
		r.enterPassword(r.getPassword());
	}
}
