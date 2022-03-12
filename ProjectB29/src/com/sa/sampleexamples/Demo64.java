//10-02-2022
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
//Application will be slow but selenium will be fast---> we get No such element exception
//We can try to match selenium speed with application speed--> synchronization(slow down the selenium using Thread.sleep method).
//Thread.sleep() It is a java code. It is called blind wait
//It just wait for n seconds without checking any condition
//It waits exactly for n seconds even if element is present
//We should write multiple sleep statements where ever application is slow
//Selenium people told Not to useThread.sleep, instead they have come up with driver.manage().timeouts().implicitlywait(null)
public class Demo64 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	//Login to HRMS app using css Selector
	public static void main(String[] args) throws InterruptedException {

		//open the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	//selenium 4 version, It is available in 3 version, just instead of Time, they have used duration.	
		//ImplicitylyWait is dynamic wait, It has good advantage than Thread sleep mathod(blindWait).
		//implicit wait used only by findElement and findElements Methods.
		//It will be set seconds for each findElements.

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
		//Thread.sleep(2000);
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));//Explicit wait
		wait.until(ExpectedConditions.titleContains("Enter"));//ExpectedConditions is a class whereas ExpectedCondition is an interface.
		//print title
		System.out.println(driver.getTitle());//ImplicitlyWait method will not use getTitle method.
		//Selenium people come up with other solution, wherever we cannot use implicitlyWait method or Wherever we want to
		//synchronize other than findElements and findElement.they come up with explicitWait method. ExplicitWait handle only one method at a time.

		//click on logout button
		driver.findElement(By.id("logoutLink")).click();
		
		//wait.until(ExpectedConditions.urlContains("login"));
		wait.until(ExpectedConditions.titleContains("Login"));
		System.out.println(driver.getTitle());
		driver.close();

	}
}
