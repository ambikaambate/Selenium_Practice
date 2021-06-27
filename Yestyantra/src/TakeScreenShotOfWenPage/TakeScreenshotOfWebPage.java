package TakeScreenShotOfWenPage;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotOfWebPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		TakesScreenshot  ts = (TakesScreenshot)driver;	//upcasting
		File tempfile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File("./DefectListofWebPage/webpage214.png");
		tempfile.renameTo(destfile);
		driver.quit();

	}

}
