package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_02TestProirity {
	@Test(priority=1)
	public void demo(){
		Reporter.log("hey",true);
	}
	@Test(priority=2)
	public void sample(){
		Reporter.log("hello",true);
	}

}
