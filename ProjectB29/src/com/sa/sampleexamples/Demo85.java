//15-02-2022

//ALert Popup
package com.sa.sampleexamples;
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
public class Demo85 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		driver.get("G:/Santhosh Mobile Copied into Black pendrive of 14.9 GB/Java Training_Akshara Institute/Selenium/Day wise Work/15-02-2022/PopUpDemo.html");
		Thread.sleep(1000);
		driver.findElement(By.id("A1")).submit();
		//Why not used ImplicitWait becz ImplicitWait work only for findElements but It will not work for alert and switchTo.
		//So we can use explicitWait for alert.
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		//How do u verify that alert popup is displayed or not
		//Answer is below try and catch block, there is no other solution(like isDisplayed or not) other than this 
		try
		{
			wait.until(ExpectedConditions.alertIsPresent());//check alert is present or not. It will wait for checking 5 seconds.
			System.out.println("Alter popup is present");//If it is present
			Alert alert= driver.switchTo().alert();
			String msg=alert.getText();
			System.out.println(msg);
			alert.accept();//click ok
//			alert.dismiss();//click cancel
		}
		catch (Exception e) {             
			//After 5 seconds also if alert popup is not present then it will execute catch block.
			//explicitWait throws only one exceptions i.e timeout exception
			System.out.println("Alter popup is NOT present");
		}
					
		//driver.close();
	}
}