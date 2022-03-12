//26-01-2022
package com.sa.sampleexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
/*Diff ways to check a page is displayed or not
 * 1. check the title
 * 2. check the url
 * 3. check the element
 */
public class Demo18 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	//Login to acti time app using css Selector
	public static void main(String[] args) throws InterruptedException {

		//open the browser
		WebDriver driver=new ChromeDriver();
		//enter the url
		driver.get("https://demo.actitime.com/login.do");
		//enter valid user name
		driver.findElement(By.cssSelector("#username")).sendKeys("santhosh");
		//enter the valid password
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		//click on login button
		driver.findElement(By.cssSelector("#loginButton")).click();
		//wait and get the title
		Thread.sleep(5000);
		//check point
		try
		{
			WebElement logout = driver.findElement(By.id("logoutLink"));
			System.out.println("Pass: Login is successfull");
		}
		catch (Exception e)
		{
			System.err.println("Fail: Login is not successfull");
		}
		//driver.close();
		
	}
}
