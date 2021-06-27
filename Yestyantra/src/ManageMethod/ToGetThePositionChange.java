 package ManageMethod;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetThePositionChange {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Point point = new Point(50,60);
		driver.manage().window().setPosition(point);

	}

}
