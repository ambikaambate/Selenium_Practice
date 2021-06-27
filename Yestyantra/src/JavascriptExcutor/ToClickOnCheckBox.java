package JavascriptExcutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnCheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/?.src=&.intl=us&.lang=en-US&.do");
		driver.findElement(By.id("login-username")).sendKeys("hfhusfygysgf");
		WebElement checkbox = driver.findElement(By.id("persistent"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox);
		
		
	}

}
