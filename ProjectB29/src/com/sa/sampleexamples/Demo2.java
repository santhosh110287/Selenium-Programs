package com.sa.sampleexamples; //Package means folder, subfolder

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;// fully qualified class name
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/Chromedriver.exe");
		//This function used to set driver path programatically and to set relative path name.
		//Before opening browser we should use set property.
		
		ChromeDriver driver=new ChromeDriver();
		
		ChromiumDriver c; //to get the input statement
		RemoteWebDriver r;
		SearchContext s; 
		JavascriptExecutor j;
		TakesScreenshot t;
		FirefoxDriver f;
		InternetExplorerDriver d;
		EdgeDriver e;
		
		
		
		//driver.get("https://www.google.com");

	}
}
