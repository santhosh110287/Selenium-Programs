//23-02-2022
//Can we handle multiple elements using POM class
//Answer: YES using FindBy annotation

package day28;
import java.util.List;

//Can we create page object model class with constructor
//Answer: YES.. 
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
 * Drawback of POM is:
 *      In place of value, we cannot use variable that is the limitation
 *      But, if we use final keyword for that line, then we can use it..becz final is a constant value.
 *      dynamic xpath(concatenate with some variable) that is not possible, in such cases we have to write driver.findElement
 */ 
public class Page3 {

	//declaration
	@FindBy(xpath="//a")
	private List<WebElement> allLinks;

	//initialization(Constructor to create and call initElement)
	public Page3(WebDriver driver) {
		PageFactory.initElements(driver, this);//address of browser and address of POM class object
	}

	//utilization
	public void printLinkCOunt()
	{
		int count=allLinks.size();
		System.out.println(count);
	}
	
	public void printAllLinks() {
		for (WebElement link : allLinks) {
			System.out.println(link.getText());
		}
	}

}


