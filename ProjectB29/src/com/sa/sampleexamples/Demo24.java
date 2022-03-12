//03-02-2022
package com.sa.sampleexamples;
//Common Xpath for all languages showned in the google.com
//Dynamic xpath
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

public class Demo24 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		//Open the browser
		WebDriver driver =new ChromeDriver();
		/*
		//Enter the URL
		driver.get("G:/Santhosh Mobile Copied into Black pendrive of 14.9 GB/Java Training_Akshara Institute/Selenium/Day wise Work/03-02-2022/table.html");
		
		//Identify API Element on the browser
		String sql="//td[.='API']";
		WebElement sql_element = driver.findElement(By.xpath(sql));
		
		//Identify checkbox of API Element on the browser
		String checkbox = "//input[@type='checkbox']";
		RelativeBy Locator = RelativeLocator.with(By.xpath(checkbox)).toLeftOf(sql_element);
		
		driver.findElement(Locator).click();
	
		*/
		
	/*	
		driver.get("https://www.google.com/");
		String[] all_lan= {"ಕನ್ನಡ","தமிழ்","हिन्दी","മലയാളം"};
	
		for (String lan : all_lan) {
			String xp="//a[text()='"+lan+"']";
			WebElement lan1 = driver.findElement(By.xpath(xp));
			System.out.println(lan1);
		}
		driver.close();
	
	*/
		driver.get("https://www.google.com/");
		String[]all_lan= {"ಕನ್ನಡ","தமிழ்","हिन्दी","മലയാളം"};
		
		try {
			for (String lan : all_lan) {
				String xp="//a[text()='"+lan+"']";
				WebElement lan1 = driver.findElement(By.xpath(xp));
				lan1.click();
				System.out.println(lan1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

		driver.close();
	
		
	/*	
		String[] all_lan= {"ಕನ್ನಡ","தமிழ்","हिन्दी"};
		for (String lan : all_lan) 
		{
		String xp="//a[text()='"+lan+"']";
		driver.findElement(By.xpath(xp));
		System.out.println(xp);
		
	}
	*/
	}
}
