package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateToMainUrl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://in.linkedin.com/");
	}

}
