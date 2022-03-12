//08-02-2022
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

import javax.imageio.ImageIO;

import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;
// How do enter the value even if the text box is disabled?---Using javascript
public class Demo46 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException { 

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("G:/Santhosh Mobile Copied into Black pendrive of 14.9 GB/Java Training_Akshara Institute/Selenium/Day wise Work/08-02-2022/Element.html");
		Thread.sleep(1000);
		
		//find the element using selenium but perform the action using java script
		WebElement e = driver.findElement(By.id("A4"));
		JavascriptExecutor j=(JavascriptExecutor) driver;
		//j.executeScript("e=arguments[0];e.value='Akshara'",e);//Inject content of paranthesis to broswer
		j.executeScript("arguments[0].value='Akshara'",e);
		j.executeScript("arguments[0].value=arguments[1]",e,"santhosh");
	}

}
