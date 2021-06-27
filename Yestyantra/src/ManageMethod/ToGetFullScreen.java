package ManageMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetFullScreen {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().fullscreen();

	}
}
