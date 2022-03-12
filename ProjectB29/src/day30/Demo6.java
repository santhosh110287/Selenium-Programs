//25-02-2022
//How to run Test multiple times with different data?
//Data Provider
//Return type of DataProvider is array(Any type of array, int,string etc) or collection
package day30;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Demo6 {
	@DataProvider
	public String[] getData() {
		String[] user= {"amma","appa","Santhosh","Nivi","nithi"};//Homogeneous data type
		return user;
	}

	@Test(dataProvider="getData")    
	public void createUser(String un)	{
		Reporter.log("createUser:"+un,true);
	}
	
	
	@DataProvider
	public Object[] getData1() {
		//Heterogeneous data type
		Object[] user= {"amma","appa","Santhosh123","Nivi","nithi",123,true};//object is of type string, the parent of string is object. AutoUpcasting is happen
		return user;
	}

	@Test(dataProvider="getData1")    
	public void createUser1(Object un)	{
		Reporter.log("createUser:"+un,true);
	
	}	

}
