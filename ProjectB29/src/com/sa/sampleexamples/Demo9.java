//25-01-2022
package com.sa.sampleexamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverService;

public class Demo9 {

	static 
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new FirefoxDriver();
		
	//	driver.get("https://www.gmail.com");
		driver.get("http://kssem.edu.in");
	//	driver.navigate().to("http://www.google.com");
		Thread.sleep(1000);
		/*
		driver.navigate().back();
		
		Thread.sleep(1000);
		driver.navigate().forward();
		
		Thread.sleep(1000);
		driver.navigate().refresh();
		*/
	}

	
	
}
