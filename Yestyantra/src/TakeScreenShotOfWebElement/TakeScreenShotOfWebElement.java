package TakeScreenShotOfWebElement;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotOfWebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		File tempscreenshot = driver.findElement(By.xpath("//img[@alt='Facebook']")).getScreenshotAs(OutputType.FILE);
		File destfile = new File("./DefectListOfWebElement/Facebooklogo.png");//creating file to storingthe sreen shot file
		tempscreenshot.renameTo(destfile);
		driver.quit();
	}

}
