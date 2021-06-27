package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPastingInput {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("ambcd");
		driver.findElement(By.name("email")).sendKeys(Keys.CONTROL+"c");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.name("login")).click();
	}

}
