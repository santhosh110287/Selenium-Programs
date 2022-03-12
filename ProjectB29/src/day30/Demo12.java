//25-02-2022

package day30;
import java.util.ArrayList;
import javax.swing.text.html.HTMLDocument.Iterator;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo12 {

	@BeforeMethod  //Before every test method
	public void login() {
		Reporter.log("login",true);
	}

	@AfterMethod   //After every test method
	public void logout() {
		Reporter.log("logout",true);
	}
	
	@Test
	public void createUser()
	{
		Reporter.log("createUser:",true);
	}
	
	@Test(invocationCount=2)
	public void deleteUser()
	{
		Reporter.log("deleteUser:",true);
	}
	
}	

