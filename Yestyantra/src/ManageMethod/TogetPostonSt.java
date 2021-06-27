package ManageMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class TogetPostonSt {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Dimension point = new Dimension(50,60);
		driver.manage().window().setSize(point);

	}

}
