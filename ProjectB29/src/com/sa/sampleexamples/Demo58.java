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
// Count the number of images present on amazon page and print the value
public class Demo58 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException { 

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//enter the URL wait page is loaded
		//this get method is given by selenium to enter url
		driver.get("https://www.amazon.in/");
		List<WebElement> allLinks = driver.findElements(By.xpath("//img"));
		int count=allLinks.size();
		System.out.println(count);
		/*
		for (int i = 0; i < count; i++) {
			//boolean a = allLinks.get(i).isDisplayed();//return boolean value: True means visible, false means not visible
			//System.out.println(a);
			String linktext = allLinks.get(i).getText();
			System.out.println(linktext);
			//If we wont display proper name then make changes in the eclipse
			//i.e go to window,preferences, General, workplace, In text file encoding change the value into UTF-8 and apply & close.
		}
		*/
		Thread.sleep(1000);
		driver.close();
	}
}
