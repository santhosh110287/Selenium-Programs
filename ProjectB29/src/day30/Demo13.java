//25-02-2022

package day30;
import java.util.ArrayList;
import javax.swing.text.html.HTMLDocument.Iterator;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo13 {

	@BeforeClass  //run Before every test method iteration
	public void login() {
		Reporter.log("login",true);
	}

	@AfterClass  //run After every test method iteration
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

