//02-02-2022
package com.sa.sampleexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo23 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		//Open the browser
		WebDriver driver =new ChromeDriver();
		//Enter the URL
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//Enter valid user name
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		//Enter valid password
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//click on login button
		driver.findElement(By.id("btnLogin")).click();
		
		//wait for 1seconds
		Thread.sleep(1000);
		
		//Verify that home page is displayed(Check the title)
		String expected_url="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		String actual_url=driver.getCurrentUrl();
		
		if(actual_url.equals(expected_url)) {
			System.out.println("Pass: Home Page is Displayed");
			driver.findElement(By.xpath("//a[.='Logout']")).click();
			
		}
		else
		{
			System.out.println("Fail: Home Page is not Displayed");
		}
		//Thread.sleep(1000);
		
		driver.close();
	}
}
