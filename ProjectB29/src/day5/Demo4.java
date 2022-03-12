package day5;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo4 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	
	public static void testBrowser(WebDriver driver)
	{
		//enter the url
		driver.get("http://www.gooogle.com");
		//get the title & print it
		String title = driver.getTitle();
		System.out.println(title);
		//close the browser
		driver.close();
	}
	

	public static void main(String[] args) {
				//open the chrome browser
			//WebDriver driver =new ChromeDriver();
			//Demo4.testBrowser(driver);
			
			//open the firefox browser
			WebDriver driver2 =new FirefoxDriver();
			Demo4.testBrowser(driver2);
	}
}
