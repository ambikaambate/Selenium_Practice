package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.msrit.edu/");
		WebElement placementlink = driver.findElement(By.linkText("PLACEMENT"));
		
		Actions action = new Actions(driver);
		action.moveToElement(placementlink).perform();
		WebElement terminal = driver.findElement(By.linkText("TESTIMONIAL"));
		terminal.click();
	
		
		
		
	}

}
