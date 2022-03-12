//18-02-2022
package com.sa.sampleexamples;
//Handling Right click of mouse or it is also called as Context Click-----Context Menu
//How to handle drop down list: Answer is Select Class
//How to handle drop down Menu: Answer is Action Class---- using movetoElement method.
//How to handle Context Menu: Answer is Action Class---ContextClick
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
public class Demo110 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();//Open Chrome browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(1000);
		//span[.='right click me']   Use F12 button to open developer tool box, when you dont get inspect button.
		WebElement btn = driver.findElement(By.xpath("//span[.='right click me']"));

		Actions actions=new Actions(driver);
		actions.contextClick(btn).perform();
		//span[.='Copy']
		driver.findElement(By.xpath("//span[.='Copy']")).click();
		Thread.sleep(1000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
//		alert.dismiss();//When alert popup is having only one button,then we can call either accept or dismiss. Both will act as samething
		driver.close();		
	}
}

