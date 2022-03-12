//25-02-2022
package day30;
//Can we develop multiple test methods in the same class----YES

//what is the default Order of execution: alphabatical order
//How to run the test in required order--->We can execute test cases as per our option using priority 
//Default priority value is 0( It means if won't assign priority value for any test method then priority value for that test is 0]
//If method has same priority value then it will be execute in alphabatical order
//we can also give negative value for priority.. EX: -20  -10    -1   0   1   4   7
//Order will be in ascending order
//NOTE: Problem in testNG is, once we generate report testng will execute in normal order only.
//because when we click run, first testng will create the object of respective class and then load all the methods and call based on the priority.
//but in the report it will come in alphabatical order.
//solution for this, we can use third party tools.
import org.testng.Reporter;
import org.testng.annotations.Test;
public class Demo3 {
	
	final int i=-10;
	@Test(priority=i)
	public void registerUser()
	{
		Reporter.log("registerUser",true);
	}
	@Test
	public void editUser()
	{
		Reporter.log("editUser",true);
	}
	@Test(priority=10)
	public void deleteUser()
	{
		Reporter.log("deleteUser",true);

	}

}
