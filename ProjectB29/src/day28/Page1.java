//23-02-2022
package day28;
//Can we create page object model class without constructor, without writing an initElement 
//Answer: YES.. It is possible but condition is Before calling any mehtod , we should explicitly call PageFactory.initElements(driver, p1);  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/* Simple Page object model class
 * POM-Page Object Model
 * In the POM we will do 
 * 1.Declaration------------@FindBy
 * 2.Syntax:
 * 		@FindBy(locator="value")
 * 		 Access Specifier WebElement elementName;
 * 
 * Example: @FindBy(id="username"
 * 			priveate WebElement unTB;
 * 
 * One page class and one test class
 * 
 */
public class Page1 {
	
	//declaration
	@FindBy(id="username")
	private WebElement unTB;
	
	//utilization
	public void setUserName()
	{
		unTB.sendKeys("Santhosh");
	}
	
	
}
