package AssignmentForGenericProgram;

import java.io.File;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotForWebpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.facebook.com/");
		screenshot.getScreenshot(driver,"./DefectListofWebPage/screenshot");
	}
}

class screenshot{
	static void getScreenshot(WebDriver driver, String screenshotpath) {
			String ltd = LocalDateTime.now().toString().replace(":", "-");
			TakesScreenshot ts = (TakesScreenshot)driver;
			File tempfile = ts.getScreenshotAs(OutputType.FILE);
			File destfile = new File(screenshotpath+ltd+".png");
			tempfile.renameTo(destfile);
	}
}

