package PopUps;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopUpUsingNaukri {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		String parent = driver.getWindowHandle();
		Set<String> allwid = driver.getWindowHandles();
		allwid.remove(parent);
		for(String wid : allwid){
			driver.switchTo().window(wid);
			driver.close();
		}
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		//driver.findElement(By.xpath("//input[@class='err-border']")).sendKeys("hekjjkghkhg");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rhtrghghd");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}

}
