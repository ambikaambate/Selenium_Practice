package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrpiteIsSelected {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		System.out.println(driver.findElement(By.name("sex")).isDisplayed());
		System.out.println(driver.findElement(By.name("sex")).isSelected());
		driver.findElement(By.name("sex")).click();
	}

}
