package TakeScreenShotOfWenPage;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotOfYouTubePage {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.youtube.com/");
			
			TakesScreenshot  ts = (TakesScreenshot)driver;	//upcasting
			File tempfile = ts.getScreenshotAs(OutputType.FILE);
			File destfile = new File("./DefectListofWebPage/youtubepage.png");
			tempfile.renameTo(destfile);
			driver.quit();

		}

	}
