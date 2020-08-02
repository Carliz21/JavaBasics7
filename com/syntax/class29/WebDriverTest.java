package com.syntax.class29;

public class WebDriverTest {

	public static void main(String[] args) {

		RemoteWebDriver[] drivers = { new ChromeDriver(), new FireFoxDriver(), new SafariDriver() };

		for (RemoteWebDriver driver : drivers) {
			System.out.println("---------------------");
			driver.open();
			driver.close();
			driver.navigate();
			driver.getTitle();
			driver.getScreenshot();

		}

		WebDriver[] drivers2 = { new ChromeDriver(), new FireFoxDriver(), new SafariDriver() };

		for (WebDriver driver : drivers2) {
			driver.close();
			driver.open();
			driver.getTitle();
		}

		TakesScreenshot[] drivers3 = { new ChromeDriver(), new FireFoxDriver(), new SafariDriver() };
		for (TakesScreenshot driver : drivers3) {
			driver.getScreenshot();
			driver.getFullScreen();

		}
	}

}
