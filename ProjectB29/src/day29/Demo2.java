package day29;
//In selenium we develop 2 types of classes
//1. POM Class
//2. Test class
// #Page Object model(POM) Class is same as number of webpage
// #TestClass is same as number of Manual Test cases.

//To run multiple Test class and get the result is called as TestNG
//It is a unit Testing framework[Unit testing will be done by developers]

//No main method---instead of that we use test method
//any method with @Test annotation is called test method.
//No system.out.println instead we can use Reporter.log
//For everytime run the program, result will stored in test-output file..in that two important files are index.html and emailable-report.html

import org.testng.Reporter;
import org.testng.annotations.Test;
public class Demo2 {
	@Test
	public void testB(){
		//System.out.println("This is my TestB");//This will print only on the console
		//Reporter.log("This is my TestB");//This will print on HTML Report
		//Reporter.log("This is my TestB",false);//This will print on HTML Report
		Reporter.log("This is my TestB",true);//This will print both on console and HTML Report
	}
}
