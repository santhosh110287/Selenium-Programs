//26-01-2022
package com.sa.sampleexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*In Selenium before performing any action(click enter select get data) on the element
 *  , we should find it(search it or locate it)
 * 
 * to search the element we use 'locators', in selenium we have 8 locators
 * 1. tagName
 * 2. id
 * 3. name
 * 4. className
 * 5. linkText
 * 6. partialLinkText
 * 7. cssSelector
 * 8. xpath
 * 
 * 
 */

public class Demo12 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver =new ChromeDriver();
		driver.get("G:/Santhosh Mobile Copied into Black pendrive of 14.9 GB/Java Training_Akshara Institute/Selenium/Day wise Work/26-01-2022/Demo12.html");
		
		//one match- returns address of the matching element and perform the action
		driver.findElement(By.tagName("input")).sendKeys("kssem");
		
//		WebElement element = driver.findElement(By.tagName("a"));
//		element.click();
		
		//multiple match -returns address of the 1st matching element and perform the action
		driver.findElement(By.tagName("a")).click();
		
		//no matching element- throw NSEE
		driver.findElement(By.tagName("Santhosh")).click();
		
	}


}

