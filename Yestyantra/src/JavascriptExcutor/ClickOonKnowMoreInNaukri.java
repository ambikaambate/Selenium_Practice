package JavascriptExcutor;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOonKnowMoreInNaukri {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String parentwid = driver.getWindowHandle();
		Set<String> allwid = driver.getWindowHandles();
		allwid.remove(parentwid);
		for(String wid : allwid) {
			driver.switchTo().window(wid);
			driver.close();
		}
		driver.switchTo().window(parentwid);
		driver.findElement(By.xpath("//button[text()='GOT IT']")).click();
		driver.findElement(By.xpath("//a[@title='Know more']")).click();
	}

}
