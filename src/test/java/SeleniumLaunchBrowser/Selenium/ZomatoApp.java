package SeleniumLaunchBrowser.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoApp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		WebElement ele =driver.findElement(By.cssSelector("//input[@placeholder='Search for restaurant, cuisine or a dish']"));
		ele.sendKeys("Chole Bhature");
		//ele.click();
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
