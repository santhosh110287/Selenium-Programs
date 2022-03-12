//28-02-2022
package day32;
import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	@Parameters({"browser","strX"})	
	
	@Test
	public void testA(@Optional("Chrome") String browser,@Optional("0")String strX) throws InterruptedException {
		WebDriver driver;
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		org.openqa.selenium.Dimension d=new org.openqa.selenium.Dimension(300, 600);
		driver.manage().window().setSize(d);
		
		int x=Integer.parseInt(strX);
		Point p=new Point(x,0);
		driver.manage().window().setPosition(p);
		
		driver.get("http://demo.actitime.com/login.do");


		for (int i = 1; i < 10; i++) {
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.id("username")).clear();
			Thread.sleep(500);
		}
		driver.quit();
	}

}



