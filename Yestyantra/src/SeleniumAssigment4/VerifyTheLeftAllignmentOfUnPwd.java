package SeleniumAssigment4;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheLeftAllignmentOfUnPwd {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Point username = driver.findElement(By.id("email")).getLocation();
		Point password = driver.findElement(By.id("pass")).getLocation();
		int urnm = username.getX();
		int pwd = password.getX();
		if (urnm==pwd) {
			System.out.println("left aiignment is perfectt");
		}
		else {
			System.out.println("left allignmnet is not perfect");
		}

	}

}
