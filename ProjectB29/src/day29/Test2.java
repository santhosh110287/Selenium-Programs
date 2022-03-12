//24-02-2022
//We cannot run  program without using main() method, but in Testng, we can run without main method using Test mathod.
package day29;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void testA()
	{
		System.out.println("TestA");
	}
}
