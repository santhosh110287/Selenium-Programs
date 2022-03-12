package com.sa.sampleexamples;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	static {
		//when the static block will execute answer is As soon as class is loaded, static block will be load.
		//Any static block program run only once, its best for initializing variable, static block will execute as 
		//and when class is loaded
		//String key="webdriver.chrome.driver";
		//String value="./driver/chromedriver.exe";
		//System.setProperty(key,value);
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
	
	}
}
