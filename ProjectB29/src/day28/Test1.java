//23-02-2022
package day28;
//Can we create page object model class without constructor, without writing an initElement 
//Answer: YES.. It is possible but condition is Before calling any mehtod , we should explicitly call PageFactory.initElements(driver, p1); 
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Test1 {

		static 
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();//creating object of chromedriver and calling the constructor
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://demo.actitime.com/login.do");
			
			Page1 p1=new Page1();//create an object and call initElement	
			//address of browser and address of POM class object
			PageFactory.initElements(driver, p1);//For initialization we should use PageFactory class and method initElement. we have to send browser(driver) and object of the page p1
			p1.setUserName();//initElment will initialzise the element. Internally it will execute driver.fineElement code.			
			//Before using anything we should initilize, In selenium initialization means  Element=driver.findElement, this code has to be executed.
			//For this code, we are sending driver and we need to access variable, for that we need to create object and send it.
			
			
	}
}
