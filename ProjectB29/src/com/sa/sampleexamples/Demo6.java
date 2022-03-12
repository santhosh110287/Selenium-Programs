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
public class Demo6 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.get("https://aksharatraining.com/");
		String title = driver.getTitle();
		System.out.println(title);
		//driver.close();
	}
}

