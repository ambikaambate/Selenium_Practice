package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driverssss/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://trello.com/login");
		driver.findElement(By.id("user")).sendKeys("ambikaambate96@gmail.com");
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("ambikasaggam");
		driver.findElement(By.id("login-submit")).click();
		WebElement  mock1 = driver.findElement(By.xpath("//textarea[text()='mock1']"));
		WebElement target = driver.findElement(By.xpath("(//span[text()='Add a card'])[2]"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(mock1, target);
		
	}

}
