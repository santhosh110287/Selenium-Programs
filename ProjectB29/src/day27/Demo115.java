//21-02-2022
package day27;
//How to switch from one frame to other frame
//Can we handle the elements if it inside a frame
//Answer: Yes, using
//Before finding element which is present in a frame, we should first switching to the frame
//One way of switching to the frame is based on index of the frame. that is frame(0)

//How to exit from the frame?
//Answer: Using switchTo.defaultContent() or using parentFrame()
//parentFrame() can be used when we are having nested frame.
//Nested frame means enclosing one frame with other frame.

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
public class Demo115 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();//Open Chrome browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("G:/Santhosh Mobile Copied into Black pendrive of 14.9 GB/Java Training_Akshara Institute/Selenium/Day wise Work/21-02-2022/sample1.html");
		Thread.sleep(1000);
		
		//Using index of the frame
		driver.switchTo().frame(0);//frame index
		//driver.switchTo().frame(1);//NosuchFrame exception because we have only one frame with starting index is 0.
		driver.findElement(By.id("t2")).sendKeys("nivi");//First selenium control is inside the frame. It means it will search only within the frame.
		driver.switchTo().defaultContent();//Exit from the frame
		driver.findElement(By.id("t1")).sendKeys("santhosh");//here t1 element is not in the frame, it is outside of frame, so when we run this program, we ll get no such element.
		////To overcome this problem we can switch from inside frame into outside(Exit from the frame) using defaultContent() shown in line no. 57
	
		
		//Using id or name of the frame
		driver.switchTo().frame("f1");//frame id or name
		driver.findElement(By.id("t2")).sendKeys("santhosh");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("sandeep");
	
		
		//Using Web Element
		//iframe[@src='sample2.html']
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@src='sample2.html']"));//frameElement store addresss of the elemennt.
		driver.switchTo().frame(frameElement);//using web element(Using address of the frame element)
		driver.findElement(By.id("t2")).sendKeys("amma");
		driver.switchTo().defaultContent();//If we have only one frame then we can use this
		//driver.switchTo().parentFrame();//when we have child frame then we can use this parentFrame().
		driver.findElement(By.id("t1")).sendKeys("appa");
		
		//Method Overloading: Writing multiple methods with same name and different signature
		//Example: frame()
		
		
		
		
		
		
		
	}
}

