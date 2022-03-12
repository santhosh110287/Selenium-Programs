//14-02-2022
package com.sa.sampleexamples;
/* Get options Program in drop down for second multi options
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
public class Demo77 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		driver.get("G:/Santhosh Mobile Copied into Black pendrive of 14.9 GB/Java Training_Akshara Institute/Selenium/Day wise Work/14-02-2022/ListBox2.html");
		WebElement listbox = driver.findElement(By.id("A2"));//address of A2 will be stored in the variable listbox
		Select select = new Select(listbox);//create object of select class and for select class we r sending listbox. It means select class also pointing to same object.
		
		try {
			WebElement first = select.getFirstSelectedOption();//Try block will not execute as becz A2 listbox doesnot selected none of the options
			System.out.println("First Selected Option:"+first.getText());
		} 
		catch (Exception e) {
			System.out.println("No options selected");
		}
			
		//Count the number of options present in the listbox
		List<WebElement> all_options = select.getOptions();//getoptons used to fetch all the options. address of all the options will stored in all_options
		int count=all_options.size();
		System.out.println("Total No. Of Options:"+count);

		//Print all the options present in the listbox
		System.out.println("content of the list box");
		System.out.println("------------------------");
		for (WebElement option : all_options) {
			System.out.println(option.getText());//print text of options
		}		
		driver.close();
	}
}