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

public class Demo31 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		//Open the browser
		WebDriver driver =new ChromeDriver();
		
		//Enter the URL
		driver.get("https://demo.actitime.com/login.do");
		WebElement element = driver.findElement(By.id("keepLoggedInCheckBox"));
		
		String tag = element.getTagName();
		System.out.println(tag);
		
		//Attributes titles is not there so it will return null
		String type = element.getAttribute("type");
		System.out.println(type);
		
		String ttt = element.getAttribute("title");
		System.out.println(ttt);
		
		//If text is not there we will get empty string
		String text = driver.findElement(By.id("toPasswordRecoveryPageLink")).getText();
		System.out.println(text);
		
		driver.close();
		
	}
}

