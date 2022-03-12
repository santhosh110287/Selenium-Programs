//24-02-2022
package day29;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1 {

	//Wherever we need to find an element, then we can use @FindBy annotation
	//Wherever we cant use find an element, then we can use driver, to use driver first initialize(Line number 20 to 22) and use it..
	
	@FindBy(css="#A1")              //#A1 is a CSS Selector
	private WebElement submitBTN;
	
	private WebDriver driver;
	
	public Page1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);//address of the POM object is this
	}

	public void clickSubmit() {
		submitBTN.click();
	}
	
	public void closeAlert() {
		driver.switchTo().alert().accept();//Blue color: Global variable, Grey Color: Local variable
	}

}

/*  POM class is used only to store elements and methods. It is also called Repository class.
	Two limitation wrt to Page Object Model
	1. We cannot use variable, we should use only constants
	2. If we cant handle using FindElement, we cant use @FindBy annotation. here we can write only normal program.
*/