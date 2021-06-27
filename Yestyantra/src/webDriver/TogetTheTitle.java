package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class TogetTheTitle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
	}
}
