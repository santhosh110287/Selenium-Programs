//03-02-2022
package com.sa.sampleexamples;
/*
 * toLeftOf
 * toRightOf
 * above
 * below
 * near
 */
 /*
  * Under web element Interface there are 4 methods to perform actions: clear, sendkeys, click, submit etc 
  */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

public class Demo27 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		//Open the browser
		WebDriver driver =new ChromeDriver();
		//Enter the URL
		driver.get("G:/Santhosh Mobile Copied into Black pendrive of 14.9 GB/Java Training_Akshara Institute/Selenium/Day wise Work/03-02-2022/Element.html");
		
		Thread.sleep(1000);
		driver.findElement(By.id("A1")).clear();//remove content(value) of the text box/password
		Thread.sleep(1000);
		driver.findElement(By.id("A1")).sendKeys("akshara");
		Thread.sleep(1000);
		driver.findElement(By.id("A2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("A8")).submit();
	}
}

