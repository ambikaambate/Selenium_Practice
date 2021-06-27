package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		WebElement search = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		Actions action = new Actions(driver);
		action.sendKeys(search, "ajjfjsdjhg").perform();

	}

}
