//23-02-2022
package day28;
/* Manual process
 * Open the actitime application
 * 
 * Enter invalid username, 
 * Enter invalid password
 * Click login
 * We will get error message. Now if we want to login, then there itself we can give valid username and valid password
 * Enter valid username
 * Enter valid password
 * Click login
 * 
 * But we can't automate above process using below program due to StaleElementreferenceexception.
 * StaleElementreferenceexception: Address of the element is old..
 * We will get this exception, after finding the element before performing the action, if page is refreshed we get StaleElementreferenceexception. 
 */
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestLoginDemo117{
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com/login.do");
		
		LoginPage2 l=new LoginPage2(driver);
		l.setUserName("xyz");
		l.setPassword("manager");
		l.clickLoginButton();
		Thread.sleep(1000);
		
		l.setUserName("admin");
		l.setPassword("manager");
		l.clickLoginButton();
	}
	
}

