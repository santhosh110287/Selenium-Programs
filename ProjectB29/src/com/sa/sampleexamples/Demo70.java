//11-02-2022
package com.sa.sampleexamples;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Demo70 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS); //used in selenium-3, This is not supported
		//driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(10));//used in selenium-3, This is not supported
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		//Above line used, If complicated java script given to browser then browser will take more time to execute at that time
		//code will wait for long time until it completed. In such cases we can use above line.
		//It will act like explicitWait. as per this example If javascript take 10 second then
		//it will execute next statement or else if take more time to execute then it will throw timeout exception.
		driver.get("https://www.actimind.com/");
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,500)");
		// Task of executeScript
		//1. selenium will Insert or Injecting javascript into browser and
		//2. selenium will inform to browser to run the javascript
		//3. then broswer will run the javascript. 
		//4. Wait till java script exectution is completed and acknwoledged by broswer
		//5. goto next step.
	
		j.executeAsyncScript("window.scrollBy(0,500)");
		// Task of executeScriptAsyncScript
		//1. selenium will Insert or Injecting javascript into browser and
		//2. selenium will inform to browser to run the javascript
		//3. then broswer will run the javascript. 
		//4. no waiting
		//5. goto next step.
		
		System.out.println("End");
	}
}