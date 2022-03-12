//16-02-2022

//HTML pop-up- Hidden Division popup
//Solution for this using- findelement 
package com.sa.sampleexamples;
import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.sound.midi.Soundbank;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Demo95 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		driver.get("G:/Santhosh Mobile Copied into Black pendrive of 14.9 GB/Java Training_Akshara Institute/Selenium/Day wise Work/15-02-2022/PopUpDemo.html");
		Thread.sleep(3000);
		driver.findElement(By.id("A4")).click();
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys("Santhosh");
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys("santhosh@1987");
		//driver.findElement(By.xpath("//button[text()='✕']")).click(); //close the pop up window in flipkart
		driver.findElement(By.xpath("(//button)[2]")).click();//close the pop up window in flipkart.. we can use any of these two lines
		
		
		
			
		//driver.close();
		}
	}
