package SeleniumLaunchBrowser.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S1Launchbrwoswer {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		System.out.println("Title");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.manage().window().maximize();
	}

}
