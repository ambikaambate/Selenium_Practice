import org.openqa.selenium.chrome.ChromeDriver;

public class LounchBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

	}
}
