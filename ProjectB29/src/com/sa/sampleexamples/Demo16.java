//26-01-2022
package com.sa.sampleexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo16 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	//Login to HRMS app using css Selector
	public static void main(String[] args) throws InterruptedException {

		//open the browser
		WebDriver driver=new ChromeDriver();
		//enter the url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//enter valid user name
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("admin");
		//enter the valid password
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin12345");
		//click on login button
		driver.findElement(By.cssSelector("#btnLogin")).click();
		//wait and get the url
		Thread.sleep(5000);
		//check point
		String actual_url=driver.getCurrentUrl();
		System.out.println("Actual: "+actual_url);
		
		String expected_url="dashboard";
		System.out.println("Expected: "+expected_url);
		
		if(actual_url.contains(expected_url))
		{
			System.out.println("Pass:Login is successful");
		}
		else
		{
			System.err.println("Fail:Login is NOT successful");
		}
		driver.close();
	}















}
