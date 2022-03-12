//25-02-2022
//Read some data
//Data provider will be used by developer. We can use excel sheet etc..
//Jenkins will be used because in emailable-report.html only current result will be stored but not previous one.. 
//If we want to retain old result also then we will use Jenkins

package day30;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class Demo5 {
	final int i=5;
	@Test(invocationCount=i)       //Can we use invocationCount+priority like @Test(invocationCount=i,priority)
	public void createUser()	{
		Reporter.log("createUser:Bhanu",true);
	}

}
