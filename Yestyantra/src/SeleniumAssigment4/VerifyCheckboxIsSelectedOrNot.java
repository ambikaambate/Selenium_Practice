package SeleniumAssigment4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyCheckboxIsSelectedOrNot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB");
		System.out.println(driver.findElement(By.name("sex")).isSelected());
		driver.findElement(By.name("sex")).click();
		System.out.println(driver.findElement(By.name("sex")).isSelected());
	}

}
