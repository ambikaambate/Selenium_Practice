package TakeScreenShotOfWebElement;

import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShortcutMethod {

	public static void main(String[] args) {
		String ltd = LocalDateTime.now().toString().replace(":", "-");
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	}
	
}