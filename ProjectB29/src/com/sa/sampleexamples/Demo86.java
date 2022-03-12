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
public class Demo86 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		driver.get("G:/Santhosh Mobile Copied into Black pendrive of 14.9 GB/Java Training_Akshara Institute/Selenium/Day wise Work/15-02-2022/PopUpDemo.html");
		Thread.sleep(1000);
		
		//Is it possible to handle file upload popup. Answer is: using below line
		driver.findElement(By.id("A2")).sendKeys("G:/Project Abstracts.doc");//whichever file is uploading, we can give here
		
		//driver.findElement(By.id("A2").click;	//for this type statement we will getInvalidArgumentException: Selenium is expecting path of the file not click, when we are uploading any file.
		
		//driver.findElement(By.id("A2")).sendKeys("./mydoc/Book1.xlsx");//relative path, but here relative path is not supported
		
		//we have to give only absolute path of the file as argument for sendkeys method for uploading any file of upload button.
		//When will get webdriver exception: Answer: when we give relative path at that ll get.
		//How to handle relative path: Answer is in next file Demo87
		Thread.sleep(2000);
		driver.close();
	}
}