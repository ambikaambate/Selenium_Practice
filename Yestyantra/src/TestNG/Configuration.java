package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Configuration {
	
	@BeforeSuite
	public void beforesuit1(){
		Reporter.log("before suit",true);
	}
	
	@AfterSuite
	public void aftersuit1(){
		Reporter.log("after suit",true);
	}
	
	@BeforeTest
	public void beforesuit(){
		Reporter.log("before test",true);
	}
	@AfterTest
	public void aftersuit(){
		Reporter.log("after test",true);
	}
	@BeforeClass
	public void Beforesuit(){
		Reporter.log("before class",true);
	}
	@AfterClass
	public void afterclass(){
		Reporter.log("after class",true);
	}
	@BeforeMethod
	public void beforemethod(){
		Reporter.log("before mthod",true);
	}
	@AfterMethod
	public void Aftermethod(){
		Reporter.log("after method",true);
	}
	
	@Test
	public void demo(){
		Reporter.log("hello",true);
	}

}
