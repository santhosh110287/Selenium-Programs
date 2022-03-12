//21-02-2022
package day27;
//Develop the framework like this, very very important program for framework
//Encapsulation concept:Binding data and method as a single entity
//Example: This program
//3 steps in the declaration: Declaration, Initialization and Utilization
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
		driver.get("https://demo.actitime.com/login.do");
		//driver.findElement(By.id("username")).sendKeys("admin");

		//WebElement unTB=driver.findElement(By.id("username"));
		//unTB.sendKeys("admin");

		//Seperate declaration, initialization and utilization of above line as

		//WebElement unTB;//declaration
		//unTB=driver.findElement(By.id("username"));//initialization
		//unTB.sendKeys("admin");//utilization

		LoginPage l=new LoginPage(driver);
		l.setUserName("admin");
		l.setPassword("manager");
		l.clickLoginButton();
	}
}

//NOTE: text() is current element(my own text)
//      . means either my text or my child element text