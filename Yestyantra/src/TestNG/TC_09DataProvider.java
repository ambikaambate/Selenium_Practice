package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_09DataProvider {
	@DataProvider(parallel=true)
	public String[][] sendaData(){
		String[][] srr = {{"admin","manager"},{"abcd","dacb"}};
		return srr;
	}
	@DataProvider
	public String[] sendData(){
		String[] srr = {"trainee","trsinee"};
		return srr;
		}
	@Test(dataProvider = "sendData")
	public void verifyAccount(String[] frstdata){
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(frstdata[0]);
		driver.findElement(By.id("pass")).sendKeys("frstdata");

	}
	
	

}
