package UsingGenericMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;

public class BaseTest {
	public static WebDriver driver;
		public void beforeClass(@Optional("chrome")String browserName){
			if(browserName.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "./driverssss/Chromedriver.exe");
				driver = new ChromeDriver();
			}
			driver.manage().window().maximize();
			}
		@BeforeTest(alwaysRun=true)
		public void BeforeMethod(){
			Reporter.log("BeforeMthod",true);
		}
		@AfterMethod(alwaysRun=true)
		public void AfterMthod(){
			Reporter.log("AfterMethod",true);
		}
		@AfterClass(alwaysRun=true)
		public void afterClass(){
			Reporter.log("from after class",true);
			driver.manage().deleteAllCookies();
			driver.quit();
		}

}
