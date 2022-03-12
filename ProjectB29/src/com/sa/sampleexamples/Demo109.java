//18-02-2022
package com.sa.sampleexamples;
//Drop Down Menu
//Handle Mouse hover using new class Action class.
//moveToElement method is used to mousehover, which is present in Action class.
//Whenever we call any method of action class, we should call perform() method.
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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Demo109 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
			
		WebDriver driver=new ChromeDriver();//Open Chrome browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.actimind.com/");
		Thread.sleep(1000);
		//a[contains(.,'AREAS OF EXPERTISE')]   Xpath for AREAS OF EXPERTISE button
		WebElement menu = driver.findElement(By.xpath("//a[contains(.,'AREAS OF EXPERTISE')]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(menu).perform();//Mouse hover
		//a[.='Web Crawling']  for clicking on first link.
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='Web Crawling']")).click();
		
	}
}

