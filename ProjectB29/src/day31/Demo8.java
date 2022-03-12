//26-02-2022
//How do we re-run failed test
//We can re-run failed test which is present in testing-failed.xml which is present in test-output folder
package day31;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo8 {
	@Test
	public void testA() {
		Reporter.log("testA",true);
	}
	
	@Test
	public void testB() {
		Reporter.log("testB",true);
	}
	
	@Test
	public void testC() {
		Reporter.log("testC",true);
		//Assert.fail();
	}
	
}
