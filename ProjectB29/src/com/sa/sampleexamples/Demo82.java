//14-02-2022
package com.sa.sampleexamples;
/* printing the content of the list box in sorted order
 * Instead of printing the content of listbox directly using for loop, we can do using other method 
 * Creating new ArrayList, inside the array list adding adding web element one by one and printing in seperate. 
 * 
 * We are creating ArrayList becz we cant sort the webelements(Becz as it stored address of the element) so we can add these elements
 * into new arrayList(becz It contains text or value not an address) then we can use Collections class to sort the elements which are
 * present in the ArrayList.. That is the reason we are creating arrayList 
 */
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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
public class Demo82 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		//open the browser
		WebDriver driver=new ChromeDriver();//WebDriver is parent and ChromeDriver is child.. called upcasting
		driver.get("G:/Santhosh Mobile Copied into Black pendrive of 14.9 GB/Java Training_Akshara Institute/Selenium/Day wise Work/14-02-2022/ListBox2.html");

		WebElement listbox = driver.findElement(By.id("A2"));//find the element and give it to select class
		Select select=new Select(listbox);


		List<WebElement> allOptions = select.getOptions();//getting all the options present in the listbox.. In the webElement address is stored
		//Converting list of WebElements into list of String
		//created array list and inside the arrayList we are adding it one by one and then printing using seperate for loop.
		ArrayList<String> allText=new ArrayList<String>();//we can create our own list using ArrayList ///Upcasting

		for (WebElement option : allOptions) {
			String text = option.getText();//storing all option in the text variable.
			allText.add(text);//adding content of text into allText
		}
		Collections.sort(allText);//printing the content of the list box in sorted order.. Collections is a class whereas Collection is a Interface.
		//which type of object we can sort? Answer: any object whose class implements -comparable interface.
		//Example: string class implements Comparable interface.
		//String and all the wrapper classes such as Integer 

		//printing content of list
		for (String text : allText) {
			System.out.println(text);
		}
		driver.close();
	}
}