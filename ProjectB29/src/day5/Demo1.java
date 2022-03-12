package day5;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		//open the chrome browser
		ChromeDriver driver =new ChromeDriver();
		//enter the url
		driver.get("http://www.gooogle.com");
		//get the title & print it
		String title = driver.getTitle();
		System.out.println(title);
		//close the browser
		driver.close();
	}
}
