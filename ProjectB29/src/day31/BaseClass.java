//26-02-2022
package day31;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseClass {
 
  @BeforeMethod     // Before the test block present in the xml
  public void beforeMethod() {
	  Reporter.log("@BeforeMethod",true);
  }
  
  @AfterMethod
  public void afterMethod() {
	  Reporter.log("@AfterMethod",true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("@BeforeClass",true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("@AfterClass",true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("@BeforeTest",true);
  }
  
  @AfterTest
  public void afterTest() {
	  Reporter.log("@AfterTest",true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("@BeforeSuite",true);
  }
  

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("@AfterSuite",true);
  }

}
