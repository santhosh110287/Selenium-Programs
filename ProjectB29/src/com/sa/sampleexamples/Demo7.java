//24-01-2022
package com.sa.sampleexamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * Converting child object to parent type is called as upcasting
 * Ex:WebDriver driver =new ChromeDriver();
 * why in selenium: same script works on any browser
 * 
 * i dont want to see methods of Object class in eclipse IDE
 * window->Preferences->java->Appearance->type filters->add  'java.lang.Object' apply and close
 */
public class Demo7 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		//Open the chrome browser
		WebDriver driver =new ChromeDriver();
		
		//enter the url fb.com
		driver.get("https://www.amazon.com");
		
		//get the current url from the address bar
		String current_url = driver.getCurrentUrl();
		
		//print it
		System.out.println("current_url:"+current_url);
		
		//Specify the expected url
		String expected_url="https://www.amazon.com/";
		//print it
		
		System.out.println("expected_url:"+expected_url);
		
		//compare expected with actual value & report the status
		if(current_url.equals(expected_url))
		{
			System.out.println("PASS: URL is matching");
		}
		else
		{
			System.out.println("FAIL: URL is not matching");
		}
		
		//close the browser
		driver.quit();
	}
	
	}

