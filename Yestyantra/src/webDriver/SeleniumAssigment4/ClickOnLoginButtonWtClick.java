package webDriver.SeleniumAssigment4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnLoginButtonWtClick {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//button[@name='login']")).sendKeys(Keys.ENTER);
	}

}
 