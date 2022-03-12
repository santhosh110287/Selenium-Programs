//25-02-2022
package day30;
//Can we develop multiple test cases in the same class
//Yes
//Order of execution is in alphabatical order
//We can execute test cases as per our option using priority
import org.testng.Reporter;
import org.testng.annotations.Test;
public class Demo1 {

	@Test
	public void testB()
	{
		Reporter.log("TestB",true);
	}
	@Test
	public void testA()
	{
		Reporter.log("TestA",true);

	}

}
