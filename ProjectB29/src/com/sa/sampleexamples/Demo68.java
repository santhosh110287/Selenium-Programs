//11-02-2022
package com.sa.sampleexamples;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//Application will be slow in two places: Homepage getting loaded and logoutLink
public class Demo68 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
	//1	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));//one time creation
		
		//enter the url and wait page is loaded completely
		driver.get("https://demo.actitime.com/login.do");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//enter valid user name
		driver.findElement(By.id("username")).sendKeys("admin");
		
		//enter the valid password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//click on login button
		driver.findElement(By.xpath("//div[.='Login ']")).click();

	//2	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));

	//3 Thread.sleep(1000);
		//Instead of using implicitWait or explicitWait(webDriverWait) or Thread.sleep, we can use customwait.
	//4 //customwait
		//We can synchronize the script using 6 methods, What are the types of synchronization option
		//1. using implicitWait.   2.explicitWait.  3.Thread.sleep   4.customWait  5.pageLoadTimeout()  6.ScriptTimeout()
		for (int i = 0; i <=100; i++) {
			System.out.println(i);
			try
			{
				//click on logout button
				driver.findElement(By.id("logoutLink")).click();
				System.out.println("logout link found");
				break;
			}
			catch(Exception e) {
				System.out.println("logout link not found");
				//Thread.sleep(500);
				//polling period or frequency: It means 500ms or 0.5 second.. waiting period in between iteration 
				//predicates means conditions for which it checks
			}
		}
		System.out.println("End");
	}
}