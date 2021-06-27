package DemoApplicationOfVtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		//pre -condition ------
		System.setProperty("webdriver.chrome.driver", "./driverssss/Chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/index.php?module=Leads&action=EditView&return_action=DetailView&parenttab=Marketing");
	/*	//pre-condition------------------------
		//step1: enter the url
		String actualurl ="http://localhost:8888/";
		driver.get(actualurl);
		if (driver.getCurrentUrl().equalsIgnoreCase(actualurl)) {
			System.out.println("entering currect url");
		}
		else{
			System.out.println("wrong url ");
		}*/
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
		driver.findElement(By.id("submitButton")).click();
		/*driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Lead...']")).click();*/
	}
}