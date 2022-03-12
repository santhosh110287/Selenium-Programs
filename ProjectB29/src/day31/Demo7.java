//26-02-2022
//In testNG, we wont use if else statement instead we can use Assert.assertEquals(,)
//If we want to go with verification we can with Assert
//Verification/Comparision is also called as Assertion
//In TestNG---- Assert and SoftAssert----- Selenium WebDriver
//In selenium IDE---- Assert and verify
//Example is: 
package day31;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class Demo7 {
	
	@BeforeMethod
	public void openAPP() {
		Reporter.log("Open the browser",true);
		//SoftAssert softAssert=new SoftAssert();//softAssert should be present in BeforemMethod
	}
	
	@Test
	public void testA() {
		Reporter.log("login",true);
		SoftAssert softAssert=new SoftAssert();//This can also be used in BeforeMethod also
		softAssert.assertEquals("abcd", "xyz");//verify title
		//Whenever Assertion fails, then it will not execute remaining statements of current test method 
		//Eventhough Assertion fails, if we want to print remaining statements then we can go for softAssertion
		//SoftAssertion is same as Assert, but it is not static methods.. so we should create object and refer it
		//Problem is in SoftAssertion: In softAssert we need to call one more method called assertall() then it will report the status or else
		//by default it will print Pass..
		//Another limitation in the softAssert is: If we run anything after assert.All() then if the assert will fail, then it will not execute
		//So donot write anything after assertAll()
		//Difference between Assert and softAssert
		//Assert is a static method
		
		//When to use soft Assert and Assert
		//If we are manually allowed to continue then we can use softassert---If we want to verify minor feature then we can use SoftAssert
		//If manually we can not continue if it fails then use Assert--If we want to verify basic and critical feature then we can use Assert
		//In the login page only fails then we can use Assert
		//Login, 
		//verify home page is displayed--------Assert
		//verify welcome msg displayed---------SoftAssert
		//logout
		Reporter.log("End of testA",true);
		softAssert.assertAll();//It will report the status
	}
	
	@AfterMethod
	public void closeAPP() {
		Reporter.log("Close the browser",true);
	}	
}
