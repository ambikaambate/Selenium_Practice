package TakeScreenShotOfWebElement;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakSreenShotOfFBLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		File tempfile = driver.findElement(By.xpath("//img[@title='Flipkart']")).getScreenshotAs(OutputType.FILE);
		File destfile = new File("./DefectListOfWebElement/flipkartlogo.png");
		tempfile.renameTo(destfile);
		driver.quit();
	}

}