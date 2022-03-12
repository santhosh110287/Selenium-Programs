//25-01-2022
package com.sa.sampleexamples;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo11 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("http://www.google.com");
		Thread.sleep(1000);
		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		
		//driver.close();
		
		Dimension newSize = new Dimension(700,400); 
		driver.manage().window().setSize(newSize);
		Thread.sleep(1000);
		
		Point location = driver.manage().window().getPosition();
		System.out.println(location.getX());
		System.out.println(location.getY());
		Thread.sleep(1000);
		
		//move the browser
		Point newLocation=new Point(300,100);
		driver.manage().window().setPosition(newLocation);
		Thread.sleep(1000);
		driver.close();
	
		
		
		
	}
}
