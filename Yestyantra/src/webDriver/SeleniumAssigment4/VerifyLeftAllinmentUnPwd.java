package webDriver.SeleniumAssigment4;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLeftAllinmentUnPwd {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Point unloc = driver.findElement(By.id("email")).getLocation();
		Point pwdloc = driver.findElement(By.id("pass")).getLocation();
		int startun = unloc.getX();
		int starpwd = pwdloc.getX();
		if (startun==starpwd) {
			System.out.println("left aiignment is perfect");
		} else {
			System.out.println("left allignment is not perfect");

		}
		
		 
	}

}
