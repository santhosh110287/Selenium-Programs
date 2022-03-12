//26-02-2022
//Can we create suite of suite
//YES: For this we can use <suite-files>
package day31;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 extends BaseClass{

	@Test
	public void test3() {
		Reporter.log("test3",true);
	}
}
