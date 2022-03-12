//15-02-2022
/*
  Robot class also used to move cursor to the specified position(x and y coordinators)
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

public class Demo92 {
	static 
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");

	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		//open the browser
		WebDriver driver=new FirefoxDriver();
		driver.get("https://eprocure.gov.in/eprocure/app");
		Robot robot=new Robot();

		int x=10,y=10;
		for (int i= 1; i < 200; i++) 
		{
			robot.mouseMove(x, y);
			x=x+10;
			y=y+10;
			Thread.sleep(500);
		}
		//driver.close();
	}
}