//16-02-2022

//Check after 
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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Demo94 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		driver.get("G:/Santhosh Mobile Copied into Black pendrive of 14.9 GB/Java Training_Akshara Institute/Selenium/Day wise Work/15-02-2022/PopUpDemo.html");
		Thread.sleep(3000);
		driver.findElement(By.id("A3")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("PageLink_8")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("DirectLink_12")).click();
		String filename = driver.findElement(By.id("DirectLink_12")).getText();//get the file name of downloaded file
		System.out.println(filename);
		Thread.sleep(3000);
		
		//To check the wheather file is downloaded or not without using try catch block.
		String user = System.getProperty("user.home");
		File f=new File(user+"/Downloads/"+filename);
		if(f.exists())
		{
			System.out.println("File is downloaded");
			
		}
		else
		{
			System.out.println("File is not downloaded");
		}
			
		//driver.close();
		}
	}