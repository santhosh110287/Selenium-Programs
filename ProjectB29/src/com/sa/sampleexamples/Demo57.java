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
// Count the number of links present on google page and print the text
public class Demo57 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException { 

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//enter the URL wait page is loaded
		//this get method is given by selenium to enter url
		driver.get("https://google.com");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int count=allLinks.size();
		System.out.println(count);

		for (int i = 0; i < count; i++) {
			//boolean a = allLinks.get(i).isDisplayed();//return boolean value: True means visible, false means not visible
			//System.out.println(a);
			String linktext = allLinks.get(i).getText();
			System.out.println(linktext);
			//If we wont display proper name then make changes in the eclipse
			//i.e go to window,preferences, General, workplace, In text file encoding change the value into UTF-8 and apply & close.
			
			//To validate the text present on the page.
			/*
			for (WebElement e : allLinks) {
				if(e.isDisplayed())
				{
					System.out.println(e.getText());
				}
			}
			*/
			String eText = "ಕನ್ನಡ";
			if(linktext.equals(eText))
			{
				System.out.println("Found the text");
			}

		}
		Thread.sleep(3000);
		driver.close();
	}
}
