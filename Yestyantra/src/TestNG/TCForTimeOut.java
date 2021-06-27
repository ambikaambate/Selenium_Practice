package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TCForTimeOut {
	@Test(timeOut = 1000)
	public void demo(){
		Reporter.log("hello",true);
	}

}
