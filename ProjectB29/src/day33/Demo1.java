//01-03-2022
package day33;
import java.awt.Dimension;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 {

	public static void main(String[] args) throws MalformedURLException {
		URL r=new URL("http://localhost:4444");//my laptop number,actually we should give IP address of Remote machine
		DesiredCapabilities c =new DesiredCapabilities();
		c.setBrowserName("chrome");
		WebDriver driver=new RemoteWebDriver(r,c);
		driver.get("http://www.google.com");
		
	}

}



