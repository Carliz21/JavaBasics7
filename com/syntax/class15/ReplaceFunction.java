package com.syntax.class15;

public class ReplaceFunction {

	public static void main(String[] args) {

		String me = "I am a good tester. I am a good person";

		String str = "Hello";

		// replacing lower e to upper E
		str = str.replace('e', 'E');
		System.out.println(str);

		// replacing word good--> great

		me = me.replace("good", "great");

		System.out.println(me);

		me = me.replace("we", "us");// if it finds it --> replace ; if not-->does nothing
		System.out.println(me);

		String fromApplication = "Phone number is 1234567890";

		fromApplication = fromApplication.replaceAll("[A-Z]", ""); // replacing all uppercase letters
		System.out.println(fromApplication);

		// replacing all character from a-z
		fromApplication = fromApplication.replaceAll("[a-z]", " ").trim();

		System.out.println(fromApplication);

		String another = "Hello12345";

		another = another.replaceAll("[A-Z]", "").replaceAll("[a-z]", "");
		System.out.println(another);

		String anotherWay = "HelloTTThG78478595959";
		anotherWay = anotherWay.replaceAll("[A-Za-z]", "");
		System.out.println(anotherWay);

		// replacing all numbers [0,9] from the String or you can be specific [0-5]
		String mix = "Hello67886 friends 097564";
		mix = mix.replaceAll("[0-9]", "");
		System.out.println(mix);

		// replacing all special characters
		String mix1 = "hello &*&*(#$% friends";
		mix1 = mix1.replaceAll("[^A-Za-z0-9]", ""); // will replace with the number of characters-->8
		System.out.println(mix1);

		String word = "abrakadabra";

		String replace = word.replaceAll("[^aAeEiIoOuU]", " ");

		System.out.println(replace);
		
		
		String str_Sample = "RockStar";
		System.out.println("EndsWith character 'r': " + str_Sample.endsWith("r"));

	}

}
