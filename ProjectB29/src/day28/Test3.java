//23-02-2022
//Can we handle multiple elements using POM class
//Answer: YES using FindBy annotation
package day28;
//Can we create page object model class with constructor
//Answer: YES.. 
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Test3 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com");

		Page3 p3=new Page3(driver);//create an object and Implicit call of InitElement(i.e PageFactory.initElement) in the constructor.
		//If write initElemet outside POM Class, then code will be PageFactory.initElements(driver, p1); here p1 is name of object
		//If write initElemet inside POM Class, then code will be PageFactory.initElements(driver, this); here this is a address
		p3.printLinkCOunt();
		p3.printAllLinks();
		driver.close();
	}
}
