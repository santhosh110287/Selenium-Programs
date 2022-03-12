//11-02-2022
package com.sa.sampleexamples;
/*In selenium Using Select class we can handle list box
  Three methods to select the options: using Index, using value and using text(last 2 are case sensitive)
  If argument is invalid then it will throw Nosuchelement exception.
*/
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Demo71 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		driver.get("G:/Santhosh Mobile Copied into Black pendrive of 14.9 GB/Java Training_Akshara Institute/Selenium/Day wise Work/11-02-2022/ListBox1.html");
		WebElement listbox = driver.findElement(By.id("A1"));
		//listbox.click();
		//Select is a class present in support.ui.Select
		Select select=new Select(listbox);
		Thread.sleep(1000);
		select.selectByIndex(1);
		Thread.sleep(1000);
		select.selectByValue("c");//Select class is a case-sensitive, means Bangalore is different than bangalore
		Thread.sleep(1000);
		select.selectByVisibleText("Delhi");
	}
}