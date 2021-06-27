package TakeScreenShotOfWebElement;

import java.io.File;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSearchBottun {

	public static void main(String[] args) {
		String ltd = LocalDateTime.now().toString().replace(":", "-");
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		File tempfile = driver.findElement(By.name("q")).getScreenshotAs(OutputType.FILE);
		File destfile = new File("./DefectListOfWebElement/"+ltd+"flipkartseachButton.png");
		tempfile.renameTo(destfile);
		driver.quit();
	}

}