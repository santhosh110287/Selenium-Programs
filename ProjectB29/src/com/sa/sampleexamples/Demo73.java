//11-02-2022
package com.sa.sampleexamples;
/*In selenium Using Select class we can handle list box
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
public class Demo73 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		driver.get("G:/Santhosh Mobile Copied into Black pendrive of 14.9 GB/Java Training_Akshara Institute/Selenium/Day wise Work/11-02-2022/ListBox1.html");
		WebElement listbox = driver.findElement(By.id("A1"));
		Thread.sleep(1000);
		listbox.click();
		Thread.sleep(1000);
		String xp = "//select[@id='A1']/option";
		List<WebElement> allOptions = driver.findElements(By.xpath(xp));
		int count=allOptions.size();
		System.out.println(count);
		
		for (WebElement option : allOptions) {
			System.out.println(option.getText());	
			
		}
		allOptions.get(1).click();
		Thread.sleep(1000);
		listbox.click();
		//driver.close();
	}
}