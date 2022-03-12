//10-02-2022
package com.sa.sampleexamples;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
//Application will be slow but selenium will be fast---> we get No such element exception
//We can try to match selenium speed with application speed--> synchronization(slow down the selenium using Thread.sleep method).
//Thread.sleep() It is a java code. It is called blind wait
//It just wait for n seconds without checking any condition
//It waits exactly for n seconds even if element is present
//We should write multiple sleep statements where ever application is slow
//Selenium people told Not to useThread.sleep, instead they have come up with driver.manage().timeouts().implicitlywait(null)
public class Demo63 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	//Login to HRMS app using css Selector
	public static void main(String[] args) throws InterruptedException {

		//open the browser
		WebDriver driver=new ChromeDriver();

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //We can use in selenium 3 version, line indicated deprecated, It means it is no more supported
		//driver.manage().timeouts().implicitlyWait(Duration.ofDays(10));  //selenium 4 version
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	//selenium 4 version, It is available in 3 version, just instead of Time, they have used duration.	
		//ImplicitylyWait is dynamic wait, It has good advantage than Thread sleep mathod(blindWait).
		//implicit wait used only by findElement and findElements Methods.
		//It will be set seconds for each findElements.

		Duration time = driver.manage().timeouts().getImplicitWaitTimeout(); //selenium 4 version, It is not in selenium 3
		System.out.println(time);

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
		//Thread.sleep(2000);// It is a java code..Not to useThread.sleep, they have come up with

		//click on logout button
		driver.findElement(By.id("logoutLink")).click();
		driver.close();

	}
}
