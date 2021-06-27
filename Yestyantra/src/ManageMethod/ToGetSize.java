package ManageMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetSize {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Dimension dia = driver.manage().window().getSize();
		System.out.println(dia.getHeight());
		System.out.println(dia.getWidth());
 
	}
}