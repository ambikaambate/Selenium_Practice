package SeleniumScripteAssignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CurrentWinIdsOfFacebook10 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		WebElement link = driver.findElement(By.xpath("//div[text()='Companies']"));
		Actions action = new Actions(driver);
		action.moveToElement(link).perform();
	}
	}
