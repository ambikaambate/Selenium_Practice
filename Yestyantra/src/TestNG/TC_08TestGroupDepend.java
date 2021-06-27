package TestNG;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_08TestGroupDepend {
	@Test(groups = {"smoke"})
	public void sample(){
	Reporter.log("hello ",true);
	}
				
	@Test(dependsOnGroups = {"smoke",})
	public void demo(){
	Reporter.log(" india",true);
	}
}
