package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_06TestGroupDepend {
	@Test(groups = {"smoke","regression"})
	public void sample(){
		Reporter.log("hello india",true);
	}
	
	@Test(groups = {"smoke",})
	public void demo(){
		Reporter.log("hello india",true);
	}
	
	@Test(groups = {"regression"})
	public void dina(){
		Reporter.log("hello india",true);
	}
	
	@Test(groups = {"regression","smoke"})
	public void dinga(){
		Reporter.log("hello india",true);
	}
}
