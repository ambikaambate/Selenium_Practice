package TakeScreenShotOfWenPage;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotOfFaceookApp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot  ts = (TakesScreenshot)driver;
		File tempfile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File("DefectListofWebPage/facebookpage.png");
		tempfile.renameTo(destfile);
		driver.quit();
	}

}
