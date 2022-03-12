//03-02-2022
package com.sa.sampleexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

public class Demo25 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		//Open the browser
		WebDriver driver =new ChromeDriver();
		//Enter the URL
		driver.get("G:/Santhosh Mobile Copied into Black pendrive of 14.9 GB/Java Training_Akshara Institute/Selenium/Day wise Work/03-02-2022/table.html");


		//Identify API Element on the browser
		//Identify checkbox of API Element on the browser

		//driver.findElement(with(By.xpath("//input[@type='checkbox']")).toLeftOf((By.xpath("//td[.='API']")))).click();
		System.out.println("Left of SQL is Check box: click it");
		driver.findElement(with(By.tagName("input")).toLeftOf((By.xpath("//td[.='SQL']")))).click();
		
		
		String cost = driver.findElement(with(By.tagName("td")).toRightOf((By.xpath("//td[.='SQL']")))).getText();
		System.out.println("Right of SQL is cost:"+cost);
		
		String sub = driver.findElement(with(By.tagName("td")).above((By.xpath("//td[.='SQL']")))).getText();
		System.out.println("Above the SQL is previous subject:"+sub);
		
		String sub1 = driver.findElement(with(By.tagName("td")).below((By.xpath("//td[.='SQL']")))).getText();
		System.out.println("Below the SQL is previous subject:"+sub1);
		
		driver.close();
	}
}

