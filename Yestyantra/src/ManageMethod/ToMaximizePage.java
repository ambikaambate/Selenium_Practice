package ManageMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToMaximizePage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");

	}
}
