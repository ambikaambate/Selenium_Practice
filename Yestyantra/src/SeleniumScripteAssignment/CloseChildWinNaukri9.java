package SeleniumScripteAssignment;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildWinNaukri9 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String parentwid=driver.getWindowHandle();
		Set<String> allwinids = driver.getWindowHandles();
		allwinids.remove(parentwid);
		for(String wind : allwinids)
		{
			driver.switchTo().window(wind);
			System.out.println(driver.getTitle());     
			System.out.println(driver.getCurrentUrl());
			driver.close();
		}
	}
}
