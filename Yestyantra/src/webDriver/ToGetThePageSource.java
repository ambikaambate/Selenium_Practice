package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetThePageSource {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());

	}
}