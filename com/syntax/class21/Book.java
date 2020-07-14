package com.syntax.class21;

public class Book {

	// Write program as a Book class that will have instance variables and 2
	// Constructors.
	// While creating an object make sure:
	// Instance variables are being initialized
	// Both Constructors are being executed

	String bookName;
	int bookPages;

	public Book() {
		System.out.println("Let me suggest you a book to read.");
	}

	public Book(String bookName, int bookPages) {
		this();
		this.bookName = bookName;
		this.bookPages = bookPages;
	}

	public void display() {
		System.out.println("You should read " + bookName + " it only has " + bookPages+ " pages.");

	}

	public static void main(String[] args) {
		Book obj = new Book("Outliers" , 285);
		obj.display();
	}

}
