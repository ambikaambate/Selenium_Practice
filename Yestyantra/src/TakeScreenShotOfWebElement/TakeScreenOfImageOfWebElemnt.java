package TakeScreenShotOfWebElement;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenOfImageOfWebElemnt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		File tempfile = driver.findElement(By.xpath("//div[text()='Musical Instruments']")).getScreenshotAs(OutputType.FILE);
		File destfile = new File("DefectListOfWebElement/image.png");
		tempfile.renameTo(destfile);
		driver.quit();
	}

}

