package AssigmentSeleniumuponFlipkart;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("laptops",Keys.ENTER);
		Actions action = new Actions(driver);
		action.click().perform();
		driver.findElement(By.xpath("//div[contains(text(),'DELL Vostro 3405 Ryzen 5 Quad Core 3450U')]/../..//div[contains(text(),'42,890')]")).click();
		
	}
}
	