package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_04test {
	@Test(priority =2,invocationCount=2)
	public void sample(){
		Reporter.log("hello hey");
	}
	@Test(priority =1,enabled=false)
	public void demo(){
		Reporter.log("hey hello",true);
	}

}
