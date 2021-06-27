package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckToolTip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationpractice.com/index.php");
		String tooltip = driver.findElement(By.partialLinkText("Sign in")).getAttribute("title");
		System.out.println(tooltip);

	}

}
