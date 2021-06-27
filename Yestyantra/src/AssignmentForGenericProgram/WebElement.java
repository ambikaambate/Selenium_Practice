package AssignmentForGenericProgram;

import java.io.File;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



class takes{
	public static void getscrrenshot(WebDriver driver,String screenshotpath){
		String ltd = LocalDateTime.now().toString().replace(":", "-");
		File tempfile  = driver.findElement(By.name("login")).getScreenshotAs(OutputType.FILE);
		File destfile = new File(screenshotpath+ltd+".png");
		tempfile.renameTo(destfile);
		
		}
}
public class WebElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.facebook.com/");
		takes.getscrrenshot(driver,"./DefectListOfWebElement/screenshot");
	}
	
}
