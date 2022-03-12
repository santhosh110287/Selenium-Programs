//01-03-2022
//For parallel execution we can take the help of TestNG
//We have converted Demo1 program into parallel program
//In selenium Grid its not needed to set driver executable path,,, Its useless
//Issue in TestNg is when we use@Parameter, and when we run using XML then we wont get class tag.. To get class tag, we should
//comment @Parameters line and go to Filename and right click on current java file-->TestNg--->Convert to TestNG--->
//then uncomment @Parameters line and then to to respective XML file..
package day33;
import java.awt.Dimension;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo2 {
	
	final String d_url="http://localhost:4444",d_browser="chrome",d_x="0";
	
	@Parameters({"remoteURL","browser","strX"})	//two parameter, which browser and what is the horizontal distance
	@Test
	public void testA(@Optional(d_url) String remoteURL,@Optional(d_browser) String browser,@Optional(d_x)String strX) throws InterruptedException, MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName(browser);//specify which browser
		cap.setVersion("97.0");//specify which browser version
		cap.setPlatform(Platform.WIN10);//specify which OS
		
		
		URL remote=new URL(remoteURL);		
		WebDriver driver = new RemoteWebDriver(remote,cap);
		
		//Resizing the browser
		org.openqa.selenium.Dimension d=new org.openqa.selenium.Dimension(300, 600);
		driver.manage().window().setSize(d);

		//Move the browser to specific location
		int x=Integer.parseInt(strX);
		Point p=new Point(x,0);
		driver.manage().window().setPosition(p);

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



