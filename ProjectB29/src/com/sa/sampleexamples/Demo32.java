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

import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

public class Demo32 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		//Open the browser
		WebDriver driver =new ChromeDriver();
		
		//Enter the URL
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		WebElement errMsg = driver.findElement(By.xpath("//span[contains(.,'invalid')]"));
		System.out.println(errMsg.getText());
		
		String c = errMsg.getCssValue("color");
		System.out.println(c);
		String hexColor = Color.fromString(c).asHex();
		System.out.println(hexColor);
		
		System.out.println(errMsg.getCssValue("font-size"));
		System.out.println(errMsg.getCssValue("font-family"));
		
		driver.close();
		
	}
}

