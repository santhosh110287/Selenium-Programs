//25-01-2022
package com.sa.sampleexamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.gmail.com");
		System.out.println(driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.fb.com");
		System.out.println(driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		WebElement current_element = driver.switchTo().activeElement();
		current_element.sendKeys("akshara");
		
		Thread.sleep(2000);
		//driver.quit();
	}

	
	
}
