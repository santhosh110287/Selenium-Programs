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

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

public class Demo39 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException { //Abstract window Toolkit

		Date d=new Date();
		String time_stamp = d.toString().replaceAll(":", "-");
				
		//Open the browser
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		//Enter the URL and wait till the page is loaded
		driver.get("https://aksharatraining.com/");
		
		//Robot is a third party to take screen shot of whole page
		//To take complete screen shot of desktop we can use java class... i.e awt.robot
		Robot r = new Robot(); //Robot is java class. 
		Dimension desktop_size = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rct= new Rectangle(desktop_size);
		BufferedImage img = r.createScreenCapture(rct);
		ImageIO.write(img, "png",new File("./img/desktop"+time_stamp+".png"));
		driver.close();
	}
}

