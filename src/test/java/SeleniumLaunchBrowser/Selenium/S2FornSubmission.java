package SeleniumLaunchBrowser.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S2FornSubmission {

	public static void main(String[] args) {
		
			WebDriver driver  = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
			//a[data-testid='open-registration-form-button']
			driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("pinki");
			driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Pal");
			driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("1234567890");
			driver.findElement(By.cssSelector("input[data-type=password]")).sendKeys("Test@123");
			driver.findElement(By.cssSelector("input=[value=2]")).click();
			
			
			
			//  id = u_0_8_0b
				

	}

}
