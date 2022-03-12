//25-02-2022
//Two dimension
//Iteration depends on number of rows present in data provider array
//Number of arguments depends on number of coloumn
//Number of Iteration should be same as number of rows
package day30;
import java.util.ArrayList;


import javax.swing.text.html.HTMLDocument.Iterator;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Demo9 {

	@DataProvider
	public String[][] getData() {
		String[][] user=new String[3][2];// 3 rows and 2 column
		user[0][0]="UserA";
		user[0][1]="A123";

		user[1][0]="UserB";
		user[1][1]="B123";

		user[2][0]="UserC";
		user[2][1]="C123";

		return user;
	}

	@Test(dataProvider="getData")    
	public void createUser(String un,String pw)	
	{
		Reporter.log("createUser:"+un+ " "+pw,true);
	}

}	

