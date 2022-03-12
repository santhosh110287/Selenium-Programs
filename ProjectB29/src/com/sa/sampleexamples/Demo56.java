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
public class Demo56 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException { 

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//enter the URL wait page is loaded
		//this get method is given by selenium to enter url
		driver.get("https://demo.actitime.com/login.do");
		List<WebElement> list = driver.findElements(By.tagName("input"));
		System.out.println(list.size());
		list.get(2).sendKeys("Automation");
		
		WebElement unTB = driver.findElement(By.id("username"));
		WebElement unTB1 =driver.findElement(By.name("pwd"));
		String name = unTB.getAccessibleName();
		String role = unTB1.getAccessibleName();
		System.out.println("Enter the value in:" +name);
		System.out.println("Enter the value in:" +role);
		driver.close();
	}
}
