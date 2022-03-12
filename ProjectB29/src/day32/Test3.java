//28-02-2022
package day32;
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

public class Test3 {

//	static
//	{
//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
//	}

	@Test
	public void testA() throws InterruptedException, MalformedURLException {
		//WebDriver driver=new ChromeDriver();//Initially browser is opening in my system, now my intention is i want to open in remote system.
		URL remoteAddress=new URL("http://localhost:4444 ");
		
		//URL remoteAddress=new URL("http://127.0.0.1 ");
		DesiredCapabilities browser=new DesiredCapabilities();
		browser.setBrowserName("chrome");
		WebDriver driver=new RemoteWebDriver(remoteAddress, browser);
		driver.get("http://demo.actitime.com/login.do");
	
	}
}



