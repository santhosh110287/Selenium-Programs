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

public class Demo30 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		//Open the browser
		WebDriver driver =new ChromeDriver();
		
		//Enter the URL
		driver.get("https://demo.actitime.com/login.do");
		WebElement unTB = driver.findElement(By.id("username"));
		
		
		int x=unTB.getLocation().getX();
		int y=unTB.getLocation().getY();
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		
			
		int h=unTB.getSize().getHeight();
		int w=unTB.getSize().getWidth();
		System.out.println("h:"+h);
		System.out.println("w:"+w);
		
			
		//driver.close();
		
		//Selenium 3
		/*x=unTB.getRect().getX();
		y=unTB.getRect().getY();
		h=unTB.getRect().getHeight();
		w=unTB.getRect().getWidth();
		
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		System.out.println("h:"+h);
		System.out.println("w:"+w);
		*/
		
	}
}

