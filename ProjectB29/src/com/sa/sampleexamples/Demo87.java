//15-02-2022
//File Upload
package com.sa.sampleexamples;
import java.io.File;
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
public class Demo87 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		driver.get("G:/Santhosh Mobile Copied into Black pendrive of 14.9 GB/Java Training_Akshara Institute/Selenium/Day wise Work/15-02-2022/PopUpDemo.html");
		Thread.sleep(1000);
		
		//How to handle relative path
		//Answer: convert relative path into absolute path using getAbsolutePath function of file.
		String rpath = "./mydoc/Project Abstracts.doc";//relative path for respective file. This file is stored in ProjectB29 folder.
		File f = new File(rpath);
		
		String apath = f.getAbsolutePath();//converting above relative path into absolute path using getAbsolutePath function.
		driver.findElement(By.id("A2")).sendKeys(apath);
		
		
		
		
		
		//driver.close();
	}
}