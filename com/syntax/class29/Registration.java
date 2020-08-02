package com.syntax.class29;

public class Registration {

	private String email, username, password;

	static String mail = "yahoo";

	public void setEmail(String email) {
		if (email.contains("yahoo")) {
			this.email = email;
		}
	}

	public String getEmail() {
		return email;
	}

	public void setUsername(String username) {
		if (!username.isEmpty() && username.length() > 6) {
			this.username = username;
		}
	}

	public String getUsername() {
		return username;
	}

	public void setPassword(String password) {
		if (!password.isEmpty()) {
			if (password.length() > 6) {
				if (!password.contains(username)) {
					this.password = password;
				} else {
					System.out.println("Password cannot contain username");
				}
			} else {
				System.out.println("Password should be larges than 6 characters");
			}

		} else {
			System.out.println("Password cannot be empty");
		}
	}

	public String getPassword() {
		return password;
	}
}
