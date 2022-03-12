//07-02-2022
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
// No method in selenium to scroll the page
// If the page is static and element is outside the visible area(somewhrere down)
// then we need not scroll the page, selenium will auto scroll
// We use javascript to scroll the page
// How to run javascript manually?
// Open develomer toolbar(F12), goto 'console' type js code alert('hi') and press enter.
// How to run java script from selenium. Refer architecture of selenium, we can do JavaScriptExecutor Interface using typecasting
// using executeScript method of JavaScriptExecutor interface.
public class Demo43 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException { 
		//Scroll to a specific element
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actimind.com/");
		
		int h=driver.findElement(By.xpath("//header")).getSize().getHeight();//To find the height of the header section in the website

		WebElement learnMore = driver.findElement(By.xpath("//a[contains(.,'Learn')]"));
		int y=learnMore.getLocation().getY();
		y=y-h;
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,"+y+")");
		//j.executeScript("window.scrollTo(0,"+y+")");
	}
}


