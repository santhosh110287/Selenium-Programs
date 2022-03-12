//11-02-2022
package com.sa.sampleexamples;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Demo69 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		
		//We want to fail the test case, if page load takes more than 5 seconds.
		//pageLoadTimeout uses get method also it uses by navigate method.
		//pageLoadTimeout will act as a explicitWait 
		//pageLoadTimeout used to set amount of time page take to load the page.
		//pageLoadTimeout is also part of synchronization
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		Duration t = driver.manage().timeouts().getPageLoadTimeout();//It is not in selenium-3.
		System.out.println(t);
		
		try
		{
			//enter the url and wait page is loaded completely
			driver.get("https://demo.actitime.com/login.do");
			System.out.println("Page is loaded within 5 second");
		}
		
		catch (Exception e) {
			System.out.println("Page is not loaded within 5 second");
		}
		//Maximize the window
		//driver.manage().window().maximize();
		System.out.println("End");
	}
}