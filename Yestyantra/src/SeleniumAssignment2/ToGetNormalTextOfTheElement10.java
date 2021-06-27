package SeleniumAssignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetNormalTextOfTheElement10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String normaltext = driver.findElement(By.id("headerContainer")).getText();
		System.out.println(normaltext);
	}

}
