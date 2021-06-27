package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoubleClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
	}

}
