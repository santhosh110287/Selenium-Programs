//26-02-2022
//If we want to select only part of method then we can use groups
package day31;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4 {
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
