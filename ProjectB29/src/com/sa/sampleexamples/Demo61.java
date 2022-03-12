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

import net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution.ForRebasedConstructor;
// Handle Auto suggestions in the google
// wherever we use findElements, always we can use xpath and foreach loop
public class Demo61 {

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
		//driver.switchTo().activeElement().sendKeys("Java"); Sendkeys to google using active element method
		driver.findElement(By.name("q")).sendKeys("Java");//Sendkeys to google using find element method
		Thread.sleep(3000);
		String xp = "//span[contains(.,'java')]";
		List<WebElement> allASE = driver.findElements(By.xpath(xp));//allASE means all auto suggestion elements
		int count=allASE.size();
		System.out.println("Number of Auto Suggestion:"+count);
		
		for (WebElement ase : allASE) 
		{
			System.out.println(ase.getText());
		}
		
		Thread.sleep(1000);
		//allASE.get(0).click();//Select first auto suggestion
		//allASE.get(count-1).click();//Select last auto suggestion
		//Select auto suggestion based on text
		for (WebElement ase : allASE) 
		{
			String text = ase.getText();
			if(text.equals("java rain resort")) {
				ase.click();
				break;
			}
		}
		
		
		driver.close();
	}
}
