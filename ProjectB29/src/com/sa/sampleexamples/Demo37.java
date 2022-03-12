//05-02-2022
package com.sa.sampleexamples;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

public class Demo37 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	
	public static void main(String[] args) throws InterruptedException, IOException {

		Date d=new Date();
		String time_stamp = d.toString().replaceAll(":", "-");
				
		//Open the browser
		WebDriver driver =new ChromeDriver();
		
		//Enter the URL and wait till the page is loaded
		driver.get("https://demo.actitime.com/login.do");
		TakesScreenshot t=(TakesScreenshot)driver;
		File srcImg = t.getScreenshotAs(OutputType.FILE);
		File dstImg= new File("./img/page"+time_stamp+".png");//To avoid over riding we have used time stamp.
		FileUtils.copyFile(srcImg, dstImg);
		driver.close();
	}
}

