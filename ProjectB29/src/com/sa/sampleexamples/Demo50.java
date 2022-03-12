//08-02-2022
package com.sa.sampleexamples;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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

/* 
 * Check the tab order
 * 
 */
public class Demo50 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException { 

		WebDriver driver =new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");

		WebElement e1 = driver.switchTo().activeElement();
		Thread.sleep(1000);
		String n1 = e1.getAttribute("name");
		System.out.println(n1);

		e1.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
		WebElement e2 = driver.switchTo().activeElement();
		String n2 = e2.getAttribute("name");
		System.out.println(n2);
		
		driver.close();
	}

}
