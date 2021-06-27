package SeleniumAssignment2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnLinkOnThe3rdWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Set<String> allwid = driver.getWindowHandles();
		for(String wid : allwid){
			driver.switchTo().window(wid);
			String sc = driver.getTitle();
			if (sc.equals("Ice Mortgage")) {
				driver.findElement(By.xpath("//img[@alt='Ice Mortgage']")).click();
			}
		}
		
	}
}

	