package com.sa.sampleexamples;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo4 {
	//webdriver.gecko.driver system property
			public static void main(String[] args) {
				System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
				FirefoxDriver driver=new FirefoxDriver();
				driver.get("https://www.google.com");
		}
}
