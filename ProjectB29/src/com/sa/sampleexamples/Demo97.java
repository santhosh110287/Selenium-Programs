//16-02-2022

//Open window and get the url and open new window with tab..
package com.sa.sampleexamples;
import java.io.File;




import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.List;
import java.util.Scanner;
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
public class Demo97 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		//open the browser
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.get("https://demo.actitime.com/login.do");
		driver.get("https://www.google.com");
		Thread.sleep(1000);
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(1000);
		driver.switchTo().newWindow(WindowType.WINDOW);//Open new window and transfer the control of selenium from current browser to new browser
		//driver.close();
		}
	}

