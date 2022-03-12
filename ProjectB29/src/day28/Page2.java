//23-02-2022
package day28;
//Can we create page object model class with constructor
//Answer: YES.. 
//Can we handle single elements using POM
//Answer: YES using FindBy annotation
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*
 * POM-Page Object Model
 * In the POM we will do 
 * 1.Declaration------------@FindBy
 * 2.Syntax:
 * 		@FindBy(locator="value")
 * 		 AS WebElement elementName;
 */
public class Page2 {

	//declaration
	@FindBy(id="username")
	private WebElement unTB;

	//initialization(Constructor to create and call initElement)
	public Page2(WebDriver driver) {
		PageFactory.initElements(driver, this);//address of browser and address of POM class object
	}

	//utilization
	public void setUserName()
	{
		unTB.sendKeys("Santhosh");
	}


}
