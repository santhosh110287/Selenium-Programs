package com.sa.sampleexamples;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void main(String[] args) {
		System.out.println("santhosh");
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key,value);
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
	}
}