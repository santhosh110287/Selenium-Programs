//15-02-2022
//File download
/*In firefox browser click on download link will display file download popup, we cant handle it in selenium.
  for that we use robot class.
  AWT: Abstract window Toolkit
*/
package com.sa.sampleexamples;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.sound.midi.Soundbank;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo89 {
	static 
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		//System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
		//open the browser
		WebDriver driver=new FirefoxDriver();
		driver.get("https://eprocure.gov.in/eprocure/app");
		Thread.sleep(3000);
		/*
		driver.findElement(By.id("A3")).click();
		Thread.sleep(1000);
		 */
		driver.findElement(By.id("PageLink_8")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("DirectLink_12")).click();

		Robot robot=new Robot();//java has class called Robot.
		robot.keyPress(KeyEvent.VK_DOWN);//VK is virtual key
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		//driver.close();
	}
}