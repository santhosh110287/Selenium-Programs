//26-02-2022
//In testNG, we wont use if else statement instead we can use Assert.assertEquals(,)
//If we want to go with verification we can with Assert
//Verification/Comparision is also called as Assertion
//Example is: 
package day31;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Demo6 {
	
	@BeforeMethod
	public void openAPP() {
		Reporter.log("Open the browser",true);
	}
	
	@AfterMethod
	public void closeAPP() {
		Reporter.log("Close the browser",true);
	}
	
	@Test
	public void testA() {
	
		Reporter.log("Enter URL",true);
		Reporter.log("Enter username, password and click login",true);
		Reporter.log("Verify Home Page is displayed or not",true);
		Reporter.log("Failed: Home Page is not displayed",true);
		//Assert.fail(); //This will change the status of the test to "Failed" from "Passed"
		String ev="abcd";
		String av="adcd";
		
//		if(ev.equals(av)) {
//			Reporter.log("Pass......",true);
//		}
//		else {
//			Assert.fail();
//		}
		//Line number 32 to 37 can be replaced with 39th line.. using Assert.assertEquals(,)
		Assert.assertEquals(av, ev);//Assert is class and assertEquals is a static method
		//Whenever Assertion fails, then it will not execute remaining statements of current test method 
		//Eventhough Assertion fails, if we want to print remaining statements then we can go for softAssertion
		Reporter.log("End of testA",true);
	}
}
