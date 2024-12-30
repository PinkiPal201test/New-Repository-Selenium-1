package SeleniumLaunchBrowser.Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlinkitSelf1 {

	public static void main(String[] args) throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://blinkit.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//button[text()='Detect my location']")).click();
	  Thread.sleep(10000l);
	  WebElement search = driver.findElement(By.xpath("//div[@class='SearchBar__AnimationText-sc-16lps2d-2 bdBtSc']"));
	  //WebElement search = driver.findElement(By.cssSelector("div[class*='SearchBar__AnimationText-sc-16lps2d-2 bdBtSc']"));
	  Thread.sleep(3000l);
	  search.click();
	  driver.findElement(By.xpath("//input[@placeholder='Search for atta dal and more']")).sendKeys("Milk");
	  Thread.sleep(1000l);
	  //WebElement add =driver.findElement(By.xpath("//div[text()='Amul Taaza Toned Fresh Milk']/ancestor::div[@class='Product__UpdatedContentContainer-sc-11dk8zk-7 bekgjj']/descendant::div[text()='ADD']"));
	  add.click();
	  driver.findElement(By.xpath("//div[text()='Mother Dairy Toned Fresh Milk']")).click();
	  Thread.sleep(3000l);
	  driver.findElement(By.xpath("//div[@class='AddToCart__UpdatedButtonContainer-sc-17ig0e3-0 lmopxc']")).click();
	  Thread.sleep(1000l);
	  WebElement ele =  driver.findElement(By.cssSelector("div[class$='sc-17ig0e3-9 dtDpfZ']"));
	  
	  for(int i=0; i<=5; i++)
	  {
		  ele.click();
	  }
	

}
}
