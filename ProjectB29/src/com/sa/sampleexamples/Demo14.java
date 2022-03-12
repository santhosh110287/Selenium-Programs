//26-01-2022
package com.sa.sampleexamples;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
/*In Selenium before performing any action(click enter select get data) on the element
 *  , we should find it(search it or locate it)
 * 
 * to search the element we use 'locators', in selenium we have 8 locators
 * 1. tagName
 * 2. id
 * 3. name
 * 4. className
 * 	5. linkText
 * 	6. partialLinkText
 * 7. cssSelector---- Cascading Style Sheets
 * 8. xpath
 * 
 * Note: if locator is matching with multiple elements , then findElement returns address of
 * 1st matching web element
 * 
 * if locator is not matching with any element, then findElement throws NoSuchElementException
 * 
 * cssSelector sytax:
 * tag[AN='AV']
 * 
 */
public class Demo14 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void reset(WebDriver driver) 
	{
		try 
		{
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
		}
		catch (Exception e)
		{
			
		}
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("G:/Santhosh Mobile Copied into Black pendrive of 14.9 GB/Java Training_Akshara Institute/Selenium/Day wise Work/26-01-2022/Demo13.html");
		
		driver.findElement(By.cssSelector("a[id='a1']")).click();
		reset(driver);
		
		driver.findElement(By.cssSelector("a[name='n1']")).click();
		reset(driver);
		
		driver.findElement(By.cssSelector("a[class='c1']")).click();
		reset(driver);
		
		driver.findElement(By.cssSelector("a[title='Click Me']")).click();
		reset(driver);
		
		driver.findElement(By.cssSelector("a[href='http://www.google.com']")).click();
		driver.close();
		
	}
}