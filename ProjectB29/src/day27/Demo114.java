//21-02-2022
package day27;
//Can we handle the elements if it inside a frame
//Answer: Yes, using
//Before finding element which is present in a frame, we should first switching to the frame
//One way of switching to the frame is based on frame index. that is frame(0)

import java.awt.Robot;

import java.awt.event.KeyEvent;
import java.io.File;




import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.sound.midi.Soundbank;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Demo114 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();//Open Chrome browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("G:/Santhosh Mobile Copied into Black pendrive of 14.9 GB/Java Training_Akshara Institute/Selenium/Day wise Work/21-02-2022/sample1.html");
		driver.findElement(By.id("t1")).sendKeys("santhosh");
		Thread.sleep(1000);
		//driver.findElement(By.id("t2")).sendKeys("nivi");//We cant find this t2 element because this t2 element is present outside, that is inside a frame.
		//Developer placed Sample2(t2) file in sample1(t1) file called as Embedded web page. 
			//When do we get no such file element
				/*Answer: 	Because of Wrong locators. Example Instead of using id, by mistake if we use name
							Because of By mistake if we type wrong value
							Because of there may be a synchronization issue
							we can handle synchronization using implicit or explicit wait
				*/
		//To overcome problem of above line we can frame method..
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("nivi");
	
	
	
	
	}
}

