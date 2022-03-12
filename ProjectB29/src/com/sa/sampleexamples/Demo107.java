//18-02-2022
//Notificaion popup in Chrome
//Handle Notification Popup, We cant inspect this.. dispalayed below address bar and in left side. It contains Allow and Block Button
//We can handle Notification popup by disable notifications.
//We can use Options to change the setting of the browser
//Problem: It will only hide, but it will not select either Allow or Block options.
package com.sa.sampleexamples;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;




import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.HashMap;
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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Demo107 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		HashMap<String, Integer> prefs=new HashMap<String, Integer>();//map is name for HashMap
		prefs.put("profile.default_content_setting_values.notifications", 2);//2 means block the notification, 1 means for allow

		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
		WebDriver driver=new ChromeDriver(options);//Open Chrome browser, with default setting
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.pushalert.co/demo");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("send-button")).click();
		Thread.sleep(3000);
		String msg = driver.findElement(By.id("pa_class-blocked-info")).getText();
		System.out.println(msg);
		driver.close();
		
		
		
		



	}
}

