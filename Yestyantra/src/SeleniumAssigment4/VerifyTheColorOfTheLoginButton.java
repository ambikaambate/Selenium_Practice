package SeleniumAssigment4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheColorOfTheLoginButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String getcss = driver.findElement(By.name("login")).getCssValue("border-bottom-color");
		System.out.println(getcss);
	}

}
