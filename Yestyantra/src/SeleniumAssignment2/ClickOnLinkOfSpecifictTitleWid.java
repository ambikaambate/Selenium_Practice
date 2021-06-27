 package SeleniumAssignment2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnLinkOfSpecifictTitleWid {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Set<String> allwid = driver.getWindowHandles();
		for(String wid : allwid) {
			driver.switchTo().window(wid);
			String sc = driver.getTitle();
			if (sc.equals("Cognizant")) {
				driver.findElement(By.xpath("//img[@alt='Cognizant']")).click();
			}
			 
		}
		
		 
	}

}
