//17-02-2022
//Parent browser and child browser.
//we can identify weather pop up is child or not based on window. child browser having minimize, maximize and close button.
//How to automate these pop ups
package com.sa.sampleexamples;
import java.io.File;




import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
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
public class Demo99 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();//Parent browser, //open the browser
		
		String w1 = driver.getWindowHandle();//Retrieve current browser address or returns window handle of current browser or return type is string.
		System.out.println(w1);
		
		driver.get("G:/Santhosh Mobile Copied into Black pendrive of 14.9 GB/Java Training_Akshara Institute/Selenium/Day wise Work/17-02-2022/parent.html");
		driver.findElement(By.id("a1")).click();
		Thread.sleep(1000);
		
		Set<String> w2 = driver.getWindowHandles();////Retrieve all browser address(Or returns window handles of all the browser). set doesnot have duplicate elements, and no indexed
		//Return type of getwindowhandles is set
		int count=w2.size();
		System.out.println(count);
		
		for (String w : w2) 
		{
			System.out.println(w);
		}
		driver.close();//close current browser
		driver.quit();//close all browser
	}
}

