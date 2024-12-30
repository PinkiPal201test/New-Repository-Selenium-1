package SeleniumLaunchBrowser.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("8572094201");
		driver.findElement(By.name("pass")).sendKeys("pinki@123");
		driver.findElement(By.tagName("button")).click();
		//driver.findElement(By.linkText("link")).click();
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//a[@aria-label='Friends']")).click();
		//driver.switchTo().newWindow(WindowType.TAB);
		//driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//div[@aria-label='Your profile']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[text()='Settings & privacy']")).click();
		driver.findElement(By.xpath("//div[@aria-label=\"Back\"]")).click();
		driver.findElement(By.xpath("//span[@dir='auto']")).click();
		driver.findElement(By.xpath("//span[@id=':r5l:']")).click();
		
	
		

	}

}
