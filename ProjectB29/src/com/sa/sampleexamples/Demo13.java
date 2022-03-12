//26-01-2022
package com.sa.sampleexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo13 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void reset(WebDriver driver) 
	{
		try 
		{
			Thread.sleep(500);
			driver.navigate().back();
			Thread.sleep(500);
		}
		catch (Exception e)
		{
		}
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("G:/Santhosh Mobile Copied into Black pendrive of 14.9 GB/Java Training_Akshara Institute/Selenium/Day wise Work/26-01-2022/Demo13.html");
		
		driver.findElement(By.tagName("a")).click();
		reset(driver);
		
		driver.findElement(By.id("a1")).click();
		reset(driver);
		
		driver.findElement(By.name("n1")).click();
		reset(driver);
		
		driver.findElement(By.className("c1")).click();
		reset(driver);
		
		driver.findElement(By.linkText("Search")).click();
		reset(driver);
		driver.findElement(By.partialLinkText("Sea")).click();
		
	}

}

