package com.syntax.group;

public class WebDriverTest {

	public static void main(String[] args) {
		ChromeDriver cd = new ChromeDriver();
		cd.open();
		cd.close();
		cd.getTitle();
		cd.navigate();
		cd.getScreenshot();

		System.out.println("=================");
		FireFoxDriver fd = new FireFoxDriver();
		fd.open();
		fd.close();
		fd.getTitle();
		fd.navigate();
		fd.getScreenshot();

		System.out.println("=================");
		SafariDriver sd = new SafariDriver();
		sd.open();
		sd.close();
		sd.getTitle();
		sd.navigate();
		sd.getScreenshot();
	}

}
