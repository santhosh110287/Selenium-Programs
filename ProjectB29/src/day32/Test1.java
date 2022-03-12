//28-02-2022
/*
 * Can we send data from testng.xml file?
 * YES----> using  <parameter> tag
 * Example: testng_day32.xml file
 * <parameter> tag has 2 attributes name and value
 * How to recieve it in Test class?
 * using @Parameters
 * 
 * Parameters are used when value not gets changed.
 * 
 * If the value is not availabe we get TestNGException
 * we can use @Optional to define default value
 * 
 * In which case we can use @Optional
 * Answer: In case if we dont want to run from xml file, instead if we want to run from .java file.
 */
package day32;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	final String a="https://demo.actitime.com";
	final String b="ADMIN";
	final String c="manager";
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	@Parameters({"url","un","pw"})
	@Test
	public void testA(@Optional(a)String url,@Optional(b)String un, @Optional(c) String pw) {
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
	}
	
}



