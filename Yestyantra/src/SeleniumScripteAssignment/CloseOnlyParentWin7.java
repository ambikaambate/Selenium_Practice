package SeleniumScripteAssignment;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyParentWin7 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String parentwid=driver.getWindowHandle();
		Set<String> childwid = driver.getWindowHandles();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
}