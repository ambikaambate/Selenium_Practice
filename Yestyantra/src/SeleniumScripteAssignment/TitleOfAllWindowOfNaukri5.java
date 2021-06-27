package SeleniumScripteAssignment;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class TitleOfAllWindowOfNaukri5
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String parentwind = driver.getWindowHandle();
		Set<String> childwind = driver.getWindowHandles();
		for (String wids : childwind ) 
		{
		    driver.switchTo().window(wids);
		    System.out.println(driver.getTitle());

		}
	}

}
