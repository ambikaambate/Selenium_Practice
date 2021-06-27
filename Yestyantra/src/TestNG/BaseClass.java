package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

public class BaseClass {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void beforesuit1(){
		Reporter.log("before suit",true);
	}
	
	@AfterSuite
	public void aftersuit1(){
		Reporter.log("after suit",true);
	}
	
	@BeforeTest
	public void beforetest(){
		Reporter.log("before test",true);
		
	}
	@AfterTest
	public void aftersuit(){
		Reporter.log("after test",true);
	}
	@BeforeClass
	public void Beforesuit(){
		Reporter.log("before class",true);
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	@AfterClass
	public void afterclass(){
		Reporter.log("after class",true);
	}
	@BeforeMethod
	public void beforemethod(){
		Reporter.log("before mthod",true);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("hhfhhf");
		
		
	}
	@AfterMethod
	public void Aftermethod(){
		Reporter.log("after method",true);
		driver.quit();
	}
	
	@Test
	public void demo(){
		Reporter.log("hello",true);
	}
}
