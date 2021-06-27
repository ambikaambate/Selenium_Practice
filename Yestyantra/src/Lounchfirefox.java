
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lounchfirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./driverssss/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebooks.com");

	}
}
