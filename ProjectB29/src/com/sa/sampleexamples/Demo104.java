//17-02-2022
//How do we handle multiple tabs in the selenium
//Using SwitchTo() and getWindowHandles()
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
public class Demo104 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();//Parent browser, //open the browser, assume gui1
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();//Go to second tab but control in the first tab itself.
		Thread.sleep(5000);
		System.out.println(driver.getTitle());//title of second tab
		Set<String> allWHS = driver.getWindowHandles();//store all tab address
		
		for (String w : allWHS) {
			driver.switchTo().window(w);
		}
		//driver.switchTo().newWindow(WindowType.TAB);//Switch to new window also control in second tab
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.linkText("Try Free")).click();
		Thread.sleep(3000);
		driver.close();//Close current tab

	}
}

