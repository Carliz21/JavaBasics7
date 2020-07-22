package com.syntax.class25;

public class FinalKeyword {

	public static String str = "Hello";

	public static final String USERNAME = "Admin";

	public final String PASSWORD = "Admin123";

	public static void main(String[] args) {

		System.out.println(str);
		str = "Hi";
		System.out.println(str);

		System.out.println(USERNAME);
		// USERNAME="User123";CE : variable is final and we cannot change it's value

		FinalKeyword fk = new FinalKeyword();
		System.out.println(fk.PASSWORD);

	}

	public final void hello() {
		System.out.println("Last hello of today");
	}

}

class FinalBaby extends FinalKeyword {

	// Final methods cannot be overridden
//	public void hello () { CE
//		System.out.println("Sorry it's not last hello");
//	}

}
