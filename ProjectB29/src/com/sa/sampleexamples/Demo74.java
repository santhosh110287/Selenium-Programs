//14-02-2022
package com.sa.sampleexamples;
/* Print the contents of listbox
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
public class Demo74 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		driver.get("G:/Santhosh Mobile Copied into Black pendrive of 14.9 GB/Java Training_Akshara Institute/Selenium/Day wise Work/14-02-2022/ListBox2.html");
		WebElement listbox = driver.findElement(By.id("A1"));//find the element and give it to select class
		
		Select select = new Select(listbox);//Select class is used to handle list box. we should use parameterized constructor 
		
		//Select all the items in the dropdown
		Thread.sleep(1000);
		select.selectByIndex(0);//using index
		Thread.sleep(1000);
		select.selectByValue("b");//using value
		Thread.sleep(1000);
		select.selectByVisibleText("Snacks");//using visible text
		
		//There are 3 select options and 4 deselect options are available.
		//deselect option is only for multiselect
		//select will work both for multiselect and single select
		
		//UnSelect all the items in the dropdown
		Thread.sleep(1000);
		select.deselectByIndex(0);
		Thread.sleep(1000);
		select.deselectByValue("b");
		Thread.sleep(1000);
		select.deselectByVisibleText("Snacks");
		select.deselectAll();
		
		boolean is_it_multi_seletct_listbox = select.isMultiple();//Check whether it is single selected or multiselected
		System.out.println(is_it_multi_seletct_listbox);
		//return true if it is multi-select listbox
		//return false if it is single-select listbox
		
			
		//driver.close();
	}
}