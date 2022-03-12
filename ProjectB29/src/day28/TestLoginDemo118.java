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
 * StaleElementreferenceexception: Address of the element is OLD.
 * when do we get this exception: After finding the element
 * Before performing the action.
 * If page is refreshed we get this exception 
 */

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestLoginDemo118{
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com/login.do");//Enter the URL and wait till page is loaded. i.e login page
		
		Thread.sleep(1000);
		driver.navigate().refresh();//After entering the URL it will refresh the page
		
		Thread.sleep(1000);
		WebElement unTB = driver.findElement(By.id("username"));//Finding the element
		
		Thread.sleep(1000);
		unTB.sendKeys("Santhosh");//Performing the action
		
	
		/*  StaleElementreferenceexception will get.. As because of these below lines.. To avoid this we will go for automation framework
		Thread.sleep(1000);
		WebElement unTB = driver.findElement(By.id("username"));//Finding the element
		
		Thread.sleep(1000);
		driver.navigate().refresh();//After entering the URL it will refresh the page
		
		Thread.sleep(1000);
		unTB.sendKeys("Santhosh");//Performing the action
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}

