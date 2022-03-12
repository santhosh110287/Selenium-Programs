//25-02-2022
//type safety: Restricting in the content storing
//Collection is mainly used for handling multiple values
//Come up with faster way of retrieving of data.
//Can we use foreach for any data type------>No, we can use only when class which implements Iterable Interface.
//foreach can be used in collection and array.
package day30;
import java.util.ArrayList;
import javax.swing.text.html.HTMLDocument.Iterator;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Demo8 {


	public static void main(String[] args) {
		ArrayList<String> data=new ArrayList<String>();//Creating an ArrayList type of object. In arrayList, type is string type
		data.add("A");
		data.add("B");
		data.add("C");
		data.add("D");

		//		for (int i = 0; i < data.size(); i++) {
		//			String s=data.get(i);
		//			System.out.println(s);
		//		}

		//Iterator means looping(Repeating)
		java.util.Iterator<String> iData = data.iterator();
		while(iData.hasNext()) {
			System.out.println(iData.next());
		}

		for (String s : data)//for each works only on class which implements Iterable interface 
		{
			System.out.println(s);			
		}

	}
}
