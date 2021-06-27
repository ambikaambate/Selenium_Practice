package SeleniumAssigment4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTexboxIsEmptyOrNot {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("hello");
		String text = driver.findElement(By.name("q")).getAttribute("type");
		if (text.isEmpty()) {
			System.out.println("text field is empty");
		} else {
			System.out.println("text field is not empty");

		}

	}

}
