//04-02-2022
package com.sa.sampleexamples;
/*
 * toLeftOf
 * toRightOf
 * above
 * below
 * near
 */
 /*
  * Under web element Interface there are 4 methods to perform actions: clear, sendkeys, click, submit etc 
  */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

public class Demo29 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		//Open the browser
		WebDriver driver =new ChromeDriver();
		
		//Enter the URL
		driver.get("G:/Santhosh Mobile Copied into Black pendrive of 14.9 GB/Java Training_Akshara Institute/Selenium/Day wise Work/04-02-2022/Element.html");
		Thread.sleep(1000);
		
		boolean res = driver.findElement(By.id("A1")).isDisplayed();
		System.out.println("A1 is Diplayed:"+res);//true-----visible
		
		boolean res1 = driver.findElement(By.id("A3")).isDisplayed();
		System.out.println("A3 is Diplayed:"+res1);//false--- not visible
		
		boolean res2 = driver.findElement(By.id("A4")).isDisplayed();
		System.out.println("A4 is Diplayed:"+res2);//true
		
		boolean res3 = driver.findElement(By.id("A5")).isSelected();
		System.out.println("A5 is Selected:"+res3);//true-- checkbox selected
		
		boolean res4 = driver.findElement(By.id("A6")).isSelected();
		System.out.println("A6 is Selected:"+res4);//false-- checkbox is not selected
		
		boolean res5 = driver.findElement(By.id("A1")).isEnabled();
		System.out.println("A1 is Enabled:"+res5);//true--- enabled (we can edit)
		
		boolean res6 = driver.findElement(By.id("A4")).isEnabled();
		System.out.println("A4 is Enabled:"+res6);//false----disabled (we cant edit)
		

		driver.close();
	}
}

