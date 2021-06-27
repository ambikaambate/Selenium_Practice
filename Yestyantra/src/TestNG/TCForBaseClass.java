package TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TCForBaseClass  extends BaseClass {
	@Test
	public void demo(){
		driver.findElement(By.id("pass")).sendKeys("nfbhf");
		
	}

}
