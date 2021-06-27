package ExploringVtigetApplication;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {

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
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		if (leadpage.equalsIgnoreCase(leadpage)) {
			System.out.println("lead page shoud be displayes");
			}
		else{
			System.out.println("lead page is should not be displayed");
			}
		String selectled = "";
		driver.findElement(By.xpath("//a[text()='Davis']")).click();
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
		//Select only organization check box click on save
		Set<String> allwid = driver.getWindowHandles();
		for(String wid : allwid){
			driver.switchTo().window(wid);
			driver.findElement(By.id("select_contact")).click();
			}
		String save = "";
		WebElement savebutton = driver.findElement(By.name("Save"));
		savebutton.click();
		if (save.equalsIgnoreCase(save)) {
			System.out.println("Contact should be selected to transfer related records message should display");
			}
		else{
			System.out.println("Contact should be selected to transfer related records message should not be display");
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
