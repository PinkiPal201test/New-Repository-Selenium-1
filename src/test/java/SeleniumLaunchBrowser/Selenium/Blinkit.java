package SeleniumLaunchBrowser.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Blinkit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver = new ChromeDriver();
		String product = "Mother Dairy Toned Fresh Milk";
		driver.get("https://blinkit.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()= 'Detect my location']")).click();
		Thread.sleep(10000l);
		WebElement  search = driver.findElement(By.cssSelector("div[class*='SearchBar__AnimationWrapper']"));
		search.click();
		//driver.findElement(By.cssSelector("input[placeholder*='Search for atta dal and more'")).sendKeys("Milk");
		//driver.findElements(By.c)
		
		//Keys.space
	

		

	}

}
