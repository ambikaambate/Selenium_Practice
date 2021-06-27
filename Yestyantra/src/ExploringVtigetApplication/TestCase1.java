package ExploringVtigetApplication;

import java.io.File;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		//pre -condition ------
		System.setProperty("webdriver.chrome.driver", "./driverssss/Chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		
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
		//step3 :click on leads and den click on create lead
		String leadpage = "";
		driver.findElement(By.xpath("//a[text()='Davis']")).click();
		if (leadpage.equalsIgnoreCase(leadpage)) {
			System.out.println("lead page shoud be displayes");
		}
		else{
			System.out.println("lead page is should not be displayed");
		}
		String createleadpage ="";
		driver.findElement(By.xpath("//img[@alt='Create Lead...']")).click();
		if (createleadpage.equalsIgnoreCase(createleadpage)) {
			System.out.println("create lead page should be displayed");
		}
		else{
			System.out.println("create lead page should not be displayed");
			
		}
		//step4 :click on cancel button
		String cancelbutton="";
		
		driver.findElement(By.name("button")).click();
		
		if (cancelbutton.equalsIgnoreCase(cancelbutton)) {	
			System.out.println("Last Name cannot be empty msg should display");
		}
		else{
			System.out.println("Last Name cannot be empty msg should not bedisplay");
		}
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
		//=====Post-condition====
				driver.manage().deleteAllCookies();
				System.out.println("Cookies is deleted successfully");
				driver.quit();
				System.out.println("The browser is closed");				
	}
}