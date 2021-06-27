package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_03TestInvocationCount {
	@Test(invocationCount = 3,priority = 1)
	public void sample(){
		Reporter.log("hello india",true);
	}
	@Test(invocationCount = 5,priority = 2)
	public void demo(){
		Reporter.log("hello im in karnataka",true);
	}

}
