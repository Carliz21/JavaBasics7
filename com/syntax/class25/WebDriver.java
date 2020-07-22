package com.syntax.class25;

public class WebDriver {

	public void open() {
		System.out.println("Opening browser");
	}

}

class FirefoxDriver extends WebDriver {

	public void open() {
		System.out.println("Open firefox browser");
	}
}

class ChromeDriver extends WebDriver {

	public void open() {
		System.out.println("Open chrome browser");
	}

}

class InternetExplorer extends WebDriver {

	public void open() {
		System.out.println("Open up internet explorer browser");
	}

}