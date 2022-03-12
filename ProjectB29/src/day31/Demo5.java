//26-02-2022
//If we want to select only part of method then we can use groups
//always login and logout method belong to any block, so for that we can use (alwaysRun=true)
//(alwaysRun=true) means Irrespective of group it should run every time
package day31;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo5 {
	
	@BeforeMethod(alwaysRun=true)
	public void login() {
		Reporter.log("login",true);
	}
	
	@AfterMethod(alwaysRun=true)
	public void logout() {
		Reporter.log("logout",true);
	}
	
	@Test(groups= {"smoke","user"})  //createUser belongs to smoke and user
	public void createUser() {
		Reporter.log("create User",true);
	}
	
	@Test(groups= {"user"})           //editUser belongs to user
	public void editUser() {
		Reporter.log("edit User",true);
	}
	
	@Test(groups= {"user"})
	public void deleteUser() {
		Reporter.log("delete User",true);
	}
	
	@Test(groups= {"smoke","Customer"})   //createCustomer belongs to smoke and user
	public void createCustomer() {
		Reporter.log("create Customer",true);
	}
	
	@Test(groups= {"Customer"})           //editUser belongs to Customer
	public void editCustomer() {
		Reporter.log("edit Customer",true);
	}
	
	@Test(groups= {"Customer"})
	public void deleteCustomer() {
		Reporter.log("delete Customer",true);
	}
	
}
