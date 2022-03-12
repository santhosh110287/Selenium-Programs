//14-02-2022
package com.sa.sampleexamples;
/* Get options Program in drop down for all options using for loop
 * This program works when there is commonality in locator value, like A1,A2,A3
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
public class Demo78 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		driver.get("G:/Santhosh Mobile Copied into Black pendrive of 14.9 GB/Java Training_Akshara Institute/Selenium/Day wise Work/14-02-2022/ListBox2.html");
			
		for(int i=1;i<=3;i++)
		{
			String loc_value="A"+i;//Concatination A1, A2, A3
			System.out.println("ListBox is:"+loc_value);

			WebElement listbox = driver.findElement(By.id(loc_value));//find the element and give it to select class
			Select select = new Select(listbox);
			
			try 
			{
				WebElement first = select.getFirstSelectedOption();
				System.out.println("First Selected Option:"+first.getText());
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			//Count the number of options present in the listbox
			List<WebElement> all_options = select.getOptions();
			int count=all_options.size();
			System.out.println("Total No. Of Options:"+count);
			
			
			//print all the options present in the listbox
			System.out.println("content of the list box");
			System.out.println("------------------------");	
			for(WebElement option:all_options)
			{
				System.out.println(option.getText());
			}
			System.out.println("------------------------");	
		}
		driver.close();
	}
}