//14-02-2022
package com.sa.sampleexamples;
/* Print the contents of listbox with looping statement and without looping statement(By making use of getWrappedElement)
 * getWrappedElement: wrapup multiple elements into single element and returns single element.
 * In selenium Using Select class we can handle list box
  Three methods to select the options: using Index, using value and using text(last 2 are case sensitive)
  If argument is invalid then it will throw Nosuchelement exception.
  we can use this Select only when we have select tag
  UnexpectedTagNameException: Other than Select it is unexpected, means Element should be of tag Select

* If the listbox tag is not <select> then we get UnexpectedTagNameException
* we can use findElements to handle the listbox whose tag is not <select>
*/
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.sound.midi.Soundbank;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Demo81 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//Print the contents of the listbox without using looping statements
		//open the browser
		WebDriver driver=new ChromeDriver();
		driver.get("G:/Santhosh Mobile Copied into Black pendrive of 14.9 GB/Java Training_Akshara Institute/Selenium/Day wise Work/14-02-2022/ListBox2.html");
		WebElement listbox = driver.findElement(By.id("A3"));//find the element and give it to select class
		Select select=new Select(listbox);
		/*
		List<WebElement> allOptions = select.getOptions();
		for (WebElement option : allOptions) {
			System.out.println(option.getText());
		}
		*/
		
		//WebElement option = select.getWrappedElement();// getWrappedElement is present in selenium-3 only.
		//System.out.println(option.getText());
		System.out.println(select.getWrappedElement().getText());//Optimizing above two lines using this single line is called Optimizing the code
		driver.close();
	}
}