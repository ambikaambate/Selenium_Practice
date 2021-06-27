package webDriver.SeleniumAssigment4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTextFieldIsEmpty {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String text = driver.findElement(By.id("email")).getAttribute("type");
		System.out.println(text);
		if (text.isEmpty()) {
			System.out.println(" text field is empty");
		} else {
			System.out.println("text field is not empty");

		}
	}

}
