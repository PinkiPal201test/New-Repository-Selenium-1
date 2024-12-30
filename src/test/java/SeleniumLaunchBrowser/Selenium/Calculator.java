package SeleniumLaunchBrowser.Selenium;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.calculator.net/");
	driver.manage().window().maximize();
	Thread.sleep(000l);
	//JavascriptExecutor jse= (JavascriptExecutor) driver; 
	//jse.executeScript("window.scrollBy(0,500)");
	Thread.sleep(3000l);
	driver.findElement(By.xpath("//*[text()='Mortgage Calculator']")).click();
	List<WebElement> linkelements =driver.findElements(By.tagName("a"));
	System.out.println("Total links are : "  +  linkelements.size());
	for(WebElement el : linkelements) {
		System.out.println(el.getText());
	}
   

	}

}
