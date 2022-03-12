//14-02-2022
package com.sa.sampleexamples;
/* Get options Program in drop down
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
public class Demo75 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		driver.get("G:/Santhosh Mobile Copied into Black pendrive of 14.9 GB/Java Training_Akshara Institute/Selenium/Day wise Work/14-02-2022/ListBox2.html");
		WebElement listbox = driver.findElement(By.id("A3"));//find the element and give it to select class
		
		Select select = new Select(listbox);
		List<WebElement> all_selected = select.getAllSelectedOptions();
		int count=all_selected.size();
		System.out.println("Total No. Of Options:"+count);
	
		//using for loop
		//print all the options present in the listbox
		System.out.println("content of the list box");
		System.out.println("------------------------");	
		for (int i = 0; i < count; i++) {
			WebElement option = all_selected.get(i);
			String text = option.getText();
			System.out.println(text);			
		}
		System.out.println("------------------------");	
		//using foreach loop
		for (WebElement selected : all_selected) {
			System.out.println(selected.getText());
		}

		//driver.close();
	}
}