//17-02-2022
//Printing the title of all the browser
//closing all the browser without using quit
//closes browser based on title(Specific browser)

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
public class Demo101 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();//Parent browser, //open the browser, assume gui1

		driver.get("G:/Santhosh Mobile Copied into Black pendrive of 14.9 GB/Java Training_Akshara Institute/Selenium/Day wise Work/17-02-2022/parent.html");
		driver.findElement(By.id("a1")).click();//It will open two subwindow, Assume gui2 and gui3
		Thread.sleep(1000);

		Set<String> allWHS = driver.getWindowHandles();//Retrieve all browser address(Or returns window handles of all the browser). set doesnot have duplicate elements, and no indexed

		//Print title of each browser(all the windows) and closes browser based on title(Specific browser)
		for (String w : allWHS) 
		{
			driver.switchTo().window(w);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.equalsIgnoreCase("akshara")) 
			{
				driver.close();
			}
			Thread.sleep(1000);
		}

	}
}

