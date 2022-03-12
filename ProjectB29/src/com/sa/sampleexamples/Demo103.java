//17-02-2022
//Switch to respective window and send title to the field present in the child windows.
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
public class Demo103 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();//Parent browser, //open the browser, assume gui1
		driver.get("G:/Santhosh Mobile Copied into Black pendrive of 14.9 GB/Java Training_Akshara Institute/Selenium/Day wise Work/17-02-2022/parent.html");

		driver.findElement(By.id("a1")).click();//It will open two subwindow, Assume gui2 and gui3
		Set<String> allWHS = driver.getWindowHandles();//Retrieve all browser address(Or returns window handles of all the browser). set doesnot have duplicate elements, and no indexed


		for(String w : allWHS) 
		{
			driver.switchTo().window(w);//Switch to particular window
			String title = driver.getTitle();
			if(title.equals("Akshara"))
			{
				driver.findElement(By.id("t1")).sendKeys(title);
			}
			else if(title.equals("Swara")) 
			{
				driver.findElement(By.id("t2")).sendKeys(title);
			}
		}
		//driver.close();//What it does. It will close last one browser

	}
}

