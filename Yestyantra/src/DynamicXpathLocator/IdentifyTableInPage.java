 package DynamicXpathLocator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyTableInPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		List<WebElement> alllinks = driver.findElements(By.xpath("//table"));
		System.out.println(alllinks.get(alllinks.size()));
	}
}
