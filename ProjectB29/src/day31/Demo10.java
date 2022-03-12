//26-02-2022
//Interviwer may get confuse like this
package day31;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo10 {

	
	//This will give deadlock situation(cyclic dependencies)
	@Test(dependsOnMethods="deleterUser")
	public void createUser() {
		Reporter.log("createUser",true);
		Assert.fail();
	}
	
	@Test(dependsOnMethods="createUser")
	//If we want to run a method,only when some other method is pass,then we can use option called dependsOnMethods
	public void deleterUser() {
		Reporter.log("deleterUser",true);
	}
}
