package SeleniumLaunchBrowser.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CovidDependant {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		WebElement cases = driver.findElement(By.xpath("//h1[text()='Coronavirus Cases:']/..//span[@style='color:#aaa']"));
		System.out.println(cases.getText());
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		WebElement text = driver.findElement(By.id("email"));
		text.sendKeys("PinkiPal");
		Thread.sleep(2000l);
		text.clear();
		System.out.println(text.getCssValue("color"));
		System.out.println(text.getCssValue("font-size"));
		System.out.println(text.isDisplayed());
		
		 
	

	}

}
