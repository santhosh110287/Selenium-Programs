//16-02-2022

//for html pop we can move and inspect
//How do we handle calender popup or hiddendivision popup or html popup
//Answer is: using findelement
//Multiple popup
//like Hidden Division popup in makemytrip
//text() means exact match ie current element text
//. means current element or its child
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
public class Demo96 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Date?");
		Scanner sc=new Scanner(System.in);
		String d=sc.nextLine();
		//open the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".langCardClose")).click();//to close down pop up..(Advertisment) 
		
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();//to click on space "Login or Create Account"
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[.='DEPARTURE']")).click();//to click on departure box// 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='March 2022']/../..//p[.='"+d+"']")).click();
		Thread.sleep(1000);
		String selected = driver.findElement(By.xpath("//p[@data-cy='departureDate']")).getText();
		System.out.println(selected);	
		
		driver.close();
		}
	}

