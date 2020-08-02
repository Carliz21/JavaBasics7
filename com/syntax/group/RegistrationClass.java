package com.syntax.group;

public class RegistrationClass {

	// Create Registration Class in which you would have variables as email,
	// userName and password that have an access scope only within its own class.
	// After creating an object of the class user should be able to call methods and
	// in each method separately
	// pass values to set users email, username and password.
	// Requirements:
	// Valid email consider to be only yahoo
	// Valid userName and password cannot be empty and should be of length larger
	// than 6 characters. Also valid password cannot contain userName.

	private String email;
	private String userName;
	private String password;

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void enterEmail(String email) {
		if (email.equals("yahoo")) {
			System.out.println(email);
		}
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void enterUserName(String userName) {
		if (userName.length() < 6) {
			System.out.println("error");
		} else {
			System.out.println(userName);
		}
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void enterPassword(String password) {
		if (password.contains(userName)) {
			System.out.println("error");
		} else if (password.length() < 6) {
			System.out.println("error");
		} else {
			System.out.println(password);
		}
	}
}

