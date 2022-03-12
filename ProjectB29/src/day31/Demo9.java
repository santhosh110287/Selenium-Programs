//26-02-2022
//what is the output?   
//1)'registerUser'   -> 'deleteUser'
//2)'deleteUser'	 -> 'registerUser'
//Answer is 2.

//How to run registerUser and then deleteUser?
//Using priority

//How to run deleteuser only if registerUser is pass?
//use option called dependsOnMethods

//In TestNG there are 3 status: 1) Passed  2)Failed  3) Skipped

package day31;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo9 {
//	@Test
//	public void registerUser() {
//		Reporter.log("registerUser",true);
//	}
//	
//	@Test
//	public void deleterUser() {
//		Reporter.log("deleterUser",true);
//	}
	
//	@Test(priority=1)
//	public void registerUser() {
//		Reporter.log("registerUser",true);
//	}
//	
//	@Test(priority=2)
//	public void deleterUser() {
//		Reporter.log("deleterUser",true);
//	}
	
//	@Test
//	public void registerUser() {
//		Reporter.log("registerUser",true);
//		Assert.fail();
//	}
//	
//	@Test(dependsOnMethods="registerUser")//If we want to run a method,only when some other method is pass,then we can use option called dependsOnMethods
//	public void deleterUser() {
//		Reporter.log("deleterUser",true);
//	}
	
	//Interviwer may get confuse like this
	//If we are using both priority and dependency, then it ll be consider dependency first
	@Test(priority=2)
	public void registerUser() {
		Reporter.log("registerUser",true);
		Assert.fail();
	}
	
	@Test(priority=1,dependsOnMethods="registerUser")
	//If we want to run a method,only when some other method is pass,then we can use option called dependsOnMethods
	public void deleterUser() {
		Reporter.log("deleterUser",true);
	}
}
