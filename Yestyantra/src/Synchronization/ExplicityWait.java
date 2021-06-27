package Synchronization;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWait {

	public static void main(String[] args) {
		String ltd = LocalDateTime.now().toString().replace(":", "-");
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		driver.get("https://www.instagram.com/");
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Log in with Facebook']")));
		driver.findElement(By.name("username")).sendKeys("abcdjf");
		driver.findElement(By.name("password")).sendKeys("254");
		
	}

}
