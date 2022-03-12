//10-02-2022
package com.sa.sampleexamples;
//Same Demo65 program written using try with multiple catch block

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.handler.timeout.TimeoutException;
//Application will be slow but selenium will be fast---> we get No such element exception
//We can try to match selenium speed with application speed--> synchronization(slow down the selenium using Thread.sleep method).
//Thread.sleep() It is a java code. It is called blind wait
//It just wait for n seconds without checking any condition
//It waits exactly for n seconds even if element is present
//We should write multiple sleep statements where ever application is slow
//Selenium people told Not to useThread.sleep, instead they have come up with driver.manage().timeouts().implicitlywait(null)
public class Demo66 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	//Login to HRMS app using css Selector
	public static void main(String[] args) throws InterruptedException {

		//open the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1));//one time creation

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

		//we can handle findElement using explicitWait also
		//but implicitWait is better
		//If Logout time link takes more time(15seconds) and time is given 10sec, then what happen if we use implicitWait and explicitWait 
		//If we use implicitWait nosuch element exception will get. 
		//If we use explicitWait if element take more time timeout exception will get based on code.
		//Example, here if we give 0 seconds in duration.of.seconds(10) then it will give timout exception in 54 line.

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
			//can we handle synchronization of any element using webdriverWait including findElement and findElements: Answer is Yes
			//implicitWait is only for findElement and findElements
			//If we give both implicitWait and explicitWait then what will happen
			//click on logout button
			driver.findElement(By.id("logoutLink")).click();
		}
		catch (NoSuchElementException e) {
			System.out.println("Implicit wait not enough");
		}
		
		try {

		} catch (TimeoutException e) {
			System.out.println("Explicit wait not enough");
		}

		driver.close();
	}
}
