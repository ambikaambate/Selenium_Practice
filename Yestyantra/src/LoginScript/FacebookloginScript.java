package LoginScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookloginScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser is lounging");
		driver.manage().window().maximize();
		System.out.println("window is maximized successfully");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//step 1 : enter the url
		String actualurl = "https://www.facebook.com/";
		driver.get(actualurl);
		if (driver.getCurrentUrl().equalsIgnoreCase(actualurl)) {
			System.out.println("currect url is entered");
		}
		else{
			System.out.println("currect url is  not entered");
		}
		String expectesTitle = "Facbook - log in or sign up";
		if (driver.getCurrentUrl().equalsIgnoreCase(expectesTitle)) {
			System.out.println("login page is displayed");
		}
			else{
				System.out.println("login page is  not displayed");
			}
			//strep2: enter username
			String actualusername = "amdh" ;
			WebElement username = driver.findElement(By.id("email"));
			username.clear();
			username.sendKeys("actualusername");
			if (actualusername.equalsIgnoreCase(username.getAttribute("vlue"))) {
				System.out.println("currect username is entered");
			}
			else{
				System.out.println("currect user name is not entered");
			}
		
			String actualpwd = "2544" ;
			WebElement pwd = driver.findElement(By.id("pass"));
			username.clear();
			username.sendKeys("actualpwd");
			if (actualusername.equalsIgnoreCase(pwd.getAttribute("vlue"))) {
				System.out.println("currect password is entered");
			}
			else{
				System.out.println("currect passeord is not entered");
			}
		//step 3 clcik on loin button
			String expectedHomePageTitle = "";
			driver.findElement(By.name("login")).click();
			if (expectedHomePageTitle.equalsIgnoreCase(driver.getTitle())) {
				System.out.println("home page should be sisplayed");
			}
			else{
				System.out.println("home page is not displayd");
			}
			//post cond
			driver.manage().deleteAllCookies();
			System.out.println("cookies deleted sussesfully");
			driver.quit();
			System.out.println("browser is closed");
	}
}