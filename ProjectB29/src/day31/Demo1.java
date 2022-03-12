//26-02-2022
//Use of Inheritance
package day31;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

class BaseTest{
	@BeforeMethod
	public void login() {
		Reporter.log("Login..",true);
	}

	@AfterMethod
	public void logout() {
		Reporter.log("Logout..",true);
	}
}

public class Demo1 extends BaseTest{  //Inheritance
	@Test
	public void testA()
	{
		Reporter.log("TestA.......",true);
	}
}
