//03-02-2022
package com.sa.sampleexamples;
/*
 * toLeftOf
 * toRightOf
 * above
 * below
 * near
 */
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

public class Demo26 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		//Open the browser
		WebDriver driver =new ChromeDriver();
		//Enter the URL
		driver.get("G:/Santhosh Mobile Copied into Black pendrive of 14.9 GB/Java Training_Akshara Institute/Selenium/Day wise Work/03-02-2022/table1.html");
		
		driver.findElement(with(By.tagName("input")).near(By.xpath("//td[.='SQL']"))).click();

	}
}

