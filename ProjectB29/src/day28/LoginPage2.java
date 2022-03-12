//23-02-2022
//Page Object Model
//To overcome StaleElementreferenceexception they have introduced Page Object Model
//LazyInitialization: Initialize during run time.
package day28;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage2 {
	
	//declaration
	//FindBy Syntax is @FinalBy(locator=value)
					 //Declaration
	@FindBy(id="username")    					//read this as FIndBy Annotation
	private WebElement unTB;
	
	@FindBy(name="pwd")							//@ means it will find latest address of the object
	private WebElement pwTB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBTN;

	
	//initialization
	public LoginPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);//PageFactory is a class
	}

	//utilization
	public void setUserName(String un){
		unTB.sendKeys(un);
	}
	public void setPassword(String pw) {
		pwTB.sendKeys(pw);
	}
	public void clickLoginButton() {
		loginBTN.click();
	}
}
