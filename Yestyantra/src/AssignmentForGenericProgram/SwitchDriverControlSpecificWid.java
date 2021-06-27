package AssignmentForGenericProgram;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchDriverControlSpecificWid {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.naukri.com/");
		switchingwid.movewid(driver);
	}
}

class switchingwid{
	public static void movewid(WebDriver driver){
		
		Set<String> allwid = driver.getWindowHandles();
		for(String wid : allwid){
			driver.switchTo().window(wid);
			System.out.println(driver.getTitle());
		}
		driver.findElement(By.xpath("//a[@target='_blank']")).click();
	}

}
