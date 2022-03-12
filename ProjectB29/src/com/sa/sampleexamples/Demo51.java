//09-02-2022
package com.sa.sampleexamples;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;
// How do enter the value even if the text box is disabled?---Using javascript
public class Demo51 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException { 

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//enter the URL wait page is loaded
		//this get method is given by selenium to enter url
		driver.get("G:/Santhosh Mobile Copied into Black pendrive of 14.9 GB/Java Training_Akshara Institute/Selenium/Day wise Work/09-02-2022/Demo.html");
		Thread.sleep(1000);

		//WebElement e = driver.findElement(By.tagName("input"));//If no element present, then, findelement throws an exception 
		//e.sendKeys("Santhosh");
		
		//If no element present, then, findelements return empty list
		List<WebElement> allElements = driver.findElements(By.tagName("input"));
		int count = allElements.size();//java methods
		System.out.println(count);
		
		WebElement e = allElements.get(0);//this get method is given by java, used to return value
		e.sendKeys("nivi");

		allElements.get(1).sendKeys("santosh");
		//allElements.get(4).sendKeys("nithi"); Throws Index out of bound exceptions

		Thread.sleep(3000);
		driver.close();


	}

}
