package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TcForThreadPoolSize {
	@Test(invocationCount=3,threadPoolSize=5)
	public void demo(){
		Reporter.log("my name is aaaanh",true);
	}

}
