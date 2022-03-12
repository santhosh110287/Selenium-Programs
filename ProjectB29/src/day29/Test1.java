//24-02-2022
package day29;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Test1 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("G:/Santhosh Mobile Copied into Black pendrive of 14.9 GB/Java Training_Akshara Institute/Selenium/Day wise Work/24-02-2022/PopUpDemo.html");
		Thread.sleep(1000);
		
		Page1 p1=new Page1(driver);
		p1.clickSubmit();
		Thread.sleep(1000);
		
		p1.closeAlert();
		Thread.sleep(1000);
		
		driver.close();

	}
}
