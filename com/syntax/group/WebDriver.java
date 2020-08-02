package com.syntax.group;

public interface WebDriver {
	void open();
	void close();
	String getTitle();
}
interface RemoteWebDriver extends WebDriver {
	void navigate();
}
interface TakesScreenshot extends RemoteWebDriver {
	void getScreenshot();
}
class ChromeDriver implements  RemoteWebDriver, WebDriver, TakesScreenshot {
	public void open() {
		System.out.println("We can open Chrome browser");
	}
	public void close() {
		System.out.println("We can close Chrome browser by clicking red cross");
	}
	public String getTitle() {
		return null;
	}
	public void navigate() {
		System.out.println("we can  navigate to Chrome settings by clicking settings button");
	}
	public void getScreenshot() {
		System.out.println("We can get screen shots from Chrome");
	}
}
class FireFoxDriver implements RemoteWebDriver, WebDriver, TakesScreenshot {
	public void open() {
		System.out.println("We can open FireFix browser");
	}
	public void close() {
		System.out.println("We can close FireFox browser by clicking red cross");
	}
	public String getTitle() {
		return null;
	}
	public void navigate() {
		System.out.println("we can  navigate to FireFox settings by clicking settings button");
	}
	public void getScreenshot() {
		System.out.println("We can get screen shots from FireFox");
	}
} 
class SafariDriver implements RemoteWebDriver, WebDriver, TakesScreenshot {
	public void open() {
		System.out.println("We can open Safari browser");
	}
	public void close() {
		System.out.println("We can close Safari browser by clicking red cross");
	}
	public String getTitle() {
		return null;
	}
	public void navigate() {
		System.out.println("we can  navigate to Safari settings by clicking settings button");
	}
	public void getScreenshot() {
		System.out.println("We can get screen shots from Safari");
	}
}
