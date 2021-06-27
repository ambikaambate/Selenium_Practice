package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckWebelementIsEnabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		System.out.println(driver.findElement(By.name("sex")).isEnabled());
		System.out.println(driver.findElement(By.name("sex")).isEnabled());
		driver.findElement(By.name("sex")).click();
	}
}