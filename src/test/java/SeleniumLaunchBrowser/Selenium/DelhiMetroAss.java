package SeleniumLaunchBrowser.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DelhiMetroAss {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://delhimetrorail.com/");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.id("buttonDismiss1")).click();
	    driver.findElement(By.cssSelector("input[id='FromStation']")).click();
	    //driver.findElement(By.xpath("//div[text()='MILLENNIUM CITY CENTRE GURUGRAM']")).click();
	    driver.findElement(By.xpath("//div[text()='MILLENNIUM CITY CENTRE GURUGRAM']")).click();
	    Thread.sleep(2000L);
	    driver.findElement(By.xpath("//font[text()='AZADPUR']")).click();
	driver.findElement(By.id("ToStation")).click();
	driver.findElement(By.xpath("//div[text()='NOIDA ELECTRONIC CITY']")).click();
	Thread.sleep(2000L);
	driver.findElement(By.xpath("//font[text()='DWARKA SECTOR - 8']")).click();
	Thread.sleep(2000L);
	driver.findElement(By.xpath("//button[text()='Show Route & Fare']")).click();
	    

	}

}
