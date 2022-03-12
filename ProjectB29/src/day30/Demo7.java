//25-02-2022
//Finally anything will be converted to Iterator
//Example: ArrayList can be convert into List, List can be to Collection, and Collection can be to Iterator
//Data Provider
//Return type is
//Object[]   It can be int, string etc.. so we will treat that as object
//Object[][]
//Iterator<Object> (any collection type)
//Iterator<Object[]>

package day30;
import java.util.ArrayList;
import javax.swing.text.html.HTMLDocument.Iterator;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Demo7 {

	@DataProvider
	public java.util.Iterator<String> getData() {
		ArrayList<String> data=new ArrayList<String>();
		data.add("A");
		data.add("B");
		data.add("C");
		java.util.Iterator<String> iData = data.iterator();
		return iData;
	}

	@Test(dataProvider="getData")    
	public void createUser(String un)	{
		Reporter.log("createUser:"+un,true);
	}
}
