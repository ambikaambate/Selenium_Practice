package ExploringVtigetApplication;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase2 {

	public static void main(String[] args) {
		//pre -condition ------
		System.setProperty("webdriver.chrome.driver", "./driverssss/Chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		//step1: enter the url
		String actualurl ="http://localhost:8888/";
		driver.get(actualurl);
		if (driver.getCurrentUrl().equalsIgnoreCase(actualurl)) {
			System.out.println("entering currect url");
			}
		else{
			System.out.println("wrong url ");
			}
		//Step2: enter the username and password
		String atualusername = "admin";
		WebElement username = driver.findElement(By.name("user_name"));
		username.sendKeys(atualusername);
		if (atualusername.equalsIgnoreCase(atualusername)) {
			System.out.println("username is currect");
			}
		else{
			System.out.println("username is not currect");
			}
			String actualpassword = "root";
			WebElement password = driver.findElement(By.name("user_password"));
			password.sendKeys(actualpassword);
		if (actualpassword.equalsIgnoreCase(actualpassword)) {
			System.out.println("password is currect");
			}
			else{
				System.out.println("password is not currect");
				}
				
		//Click on Login button
		String expectedHomePageTitle = "";
		driver.findElement(By.id("submitButton")).click();
		if(expectedHomePageTitle.equalsIgnoreCase(expectedHomePageTitle)){
		System.out.println("home page should be displayed");
		}
		else{
			System.out.println("home page should not displayes");
			}
		//step3 :click on leads and den select lead
		String leadpage = "";
		driver.findElement(By.xpath("//a[text()='Davis']")).click();
		if (leadpage.equalsIgnoreCase(leadpage)) {
			System.out.println("lead page shoud be displayes");
			}
		else{
			System.out.println("lead page is should not be displayed");
			}
		String selectled = "";
		driver.findElement(By.xpath("//a[text()='Jones']")).click();
		if (selectled.equalsIgnoreCase(selectled)) {
			System.out.println("LeadInformation page is displaying");
		}
		else{
			System.out.println("LeadInformation  page is not  displaying");
		}
		//step4: goto action and click on convert lead link
		String converlead = "";
		driver.findElement(By.xpath("//a[text()='Convert Lead']")).click();
		if (converlead.equalsIgnoreCase(converlead)) {
			System.out.println("Convert Lead Page page is displaying");
		}
		else{
			System.out.println("Convert Lead Page  page is not displaying");
		}
		//step 5  : select all check box
			
		    WebElement checkbox = driver.findElement(By.id("select_potential"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
	  		js.executeScript("arguments[0].click();", checkbox);
	  		String exdate="";
	  		WebElement date = driver.findElement(By.id("jscal_field_closedate"));
	  		date.sendKeys("2021-06-06");
	  		if (exdate.equalsIgnoreCase(exdate)) {
	  			System.out.println("entering curect date ");
	  		}
	  		else{
	  			System.out.println("entering wrong date");
				
			}
	  		String savebutton = "";
	  		WebElement save = driver.findElement(By.name("Save"));
	  		save.click();
	  		if (savebutton.equalsIgnoreCase(savebutton)) {
	  			System.out.println("orgainzatiion page should be displayed");
	  		}
	  		else{
	  			System.out.println("orgnaization page shoud not be displayed");
	  		}
	  			
	  		//=====Post-condition====
	  		driver.manage().deleteAllCookies();
	  		System.out.println("Cookies is deleted successfully");
	  		driver.quit();
	  		System.out.println("The browser is closed");
			
	  		
	}
}