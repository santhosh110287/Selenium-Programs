//02-02-2022
package com.sa.sampleexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo22 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		//Open the browser
		WebDriver driver =new ChromeDriver();
		//Enter the URL
		driver.get("https://demo.actitime.com/login.do");
		//Enter valid user name
		driver.findElement(By.id("username")).sendKeys("admin");
		
		//Enter valid password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//click on login button
		driver.findElement(By.xpath("//div[.='Login']")).click();
		
		//wait for 3seconds
		Thread.sleep(3000);
		
		//Verify that home page is displayed(Check the title)
		String expected_title="actiTIME - Enter Time-Track";
		String actual_title=driver.getTitle();
		
		if(actual_title.equals(expected_title)) {
			System.out.println("Pass: Home Page is Displayed");
			driver.findElement(By.id("logoutLink")).click();
			
		}
		else
		{
			System.out.println("Fail: Home Page is not Displayed");
		}
		Thread.sleep(1000);
		
		driver.close();
	}













}
