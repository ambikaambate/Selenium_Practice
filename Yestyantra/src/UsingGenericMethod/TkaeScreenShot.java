package UsingGenericMethod;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TkaeScreenShot {
	
	public void TakesSrceenShot(){
		
		System.setProperty("webdriver.chrome.driver", "./driverssss/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		public static void SreenShot(WebDriver driver,String filePath){
			TakesScreenshot ts = (TakesScreenshot) driver;
			File tempfile = ts.getScreenshotAs(OutputType.FILE);
			File destfile = new File("./DefectListOfWebElement/facebbok.png");
			tempfile.renameTo(destfile);
		}
}
