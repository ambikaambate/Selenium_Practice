package webDriver.SeleniumAssigment4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTheContentWtUsingClar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	    driver.findElement(By.name("q")).sendKeys("youtube");
	    driver.findElement(By.name("q")).sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		
	}

}
