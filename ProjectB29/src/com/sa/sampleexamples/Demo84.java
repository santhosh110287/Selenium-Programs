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
public class Demo84 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		driver.get("G:/Santhosh Mobile Copied into Black pendrive of 14.9 GB/Java Training_Akshara Institute/Selenium/Day wise Work/15-02-2022/PopUpDemo.html");
		Thread.sleep(1000);

		driver.findElement(By.id("A1")).click();
		Thread.sleep(1000);

		//Alert Popup is also called as JS Popup..
		//How do we identify whether it is alert pop or not
		//We cant inspect popup.. Popup will appear in the middle, below address bar and We cant move this popup(Some popus will move)
		//Alert pop has two button, OK and Cancel
		//We can handle alert pop using driver.switchTO().alert method.
		Alert alert = driver.switchTo().alert();//alert is a reference variable

		String msg = alert.getText();
		System.out.println(msg);
		alert.accept();//Click Ok
		//alert.dismiss();//Click cancel
		//If we use both accept and dismiss then we will get NoAlertPresentException
		driver.close();
	}
}