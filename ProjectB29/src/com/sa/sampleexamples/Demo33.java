//05-02-2022
package com.sa.sampleexamples;
/*
png-- Portable Network Graphics
It will be in temp folder and gets auto deleted
 */
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.io.File;

import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

public class Demo33 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		//Open the browser
		WebDriver driver =new ChromeDriver();
		
		//Enter the URL and wait till the page is loaded
		driver.get("https://demo.actitime.com/login.do");
		
		//find the element logo
		WebElement e = driver.findElement(By.cssSelector(".atLogoImg"));
		
		//get the screenshot of the element
		File Img = e.getScreenshotAs(OutputType.FILE);
		
		String path = Img.getAbsolutePath();
		System.out.println(path);
		Thread.sleep(30000);
		driver.close();
	}
}

