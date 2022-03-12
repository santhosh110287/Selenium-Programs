//01-03-2022
//we can run multiple browser in saucelab which is in selenium.dev website
//How to rename
package day33;
import java.awt.Dimension;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo3 {
	
	@Test
	public void testA() throws InterruptedException, MalformedURLException {
			ChromeOptions options =new ChromeOptions();
			options.setPlatformName("Windows 10");
			options.setBrowserVersion("latest");
			
			Map<String,Object> sauceOptions =new HashMap<>();
//			sauceOptions.put("username", System.getenv("SAUCE_USERNAME"));
//			sauceOptions.put("accessKey", System.getenv("SAUCE_ACCESS_KEY"));
			sauceOptions.put("name", "SanthoshTest");
			
			options.setCapability("sauce:options", sauceOptions);
			URL remote=new URL("https://oauth-santhoshkumars.cs-8d507:2b8c1514-c26e-476d-b534-726619c049ae@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
			WebDriver driver=new RemoteWebDriver(remote,options);
			
			driver.get("http://demo.actitime.com/login.do");

			for (int i = 1; i < 10; i++) {
				driver.findElement(By.id("username")).sendKeys("admin");
				Thread.sleep(500);
				driver.findElement(By.id("username")).clear();
				Thread.sleep(500);
			}
			driver.quit();
	}

}



