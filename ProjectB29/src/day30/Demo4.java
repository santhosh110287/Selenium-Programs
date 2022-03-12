//25-02-2022
package day30;
//invocationCount will act as a for loop
//invocationCount give individual iteration result but for loop will give only one result, either pass or fail result
//Can we run a test method multiple times without loop?
//Answer: yes using invocation count.
//default invocation count is----1
//NOTE: If its 0 or any -ve number it will not execute the test method.
//We can use final variable------it should be int(no float)


//@Test(invocationCount=i)// If we write invocationCount here i.e at class level, then all the methods will run ith number of times.
import org.testng.Reporter;
import org.testng.annotations.Test;
public class Demo4 {
	final int i=5;
	@Test(invocationCount=i)// always we will use invocationCount to the method not to the class.
	public void createUser()
	{
		Reporter.log("createUser",true);
	}

	/*
	@Test
	public void createUser1()
	{	for (int i =1 ; i < 3; i++) {
		Reporter.log("createUser1",true);
	}
	}
	 */
}
