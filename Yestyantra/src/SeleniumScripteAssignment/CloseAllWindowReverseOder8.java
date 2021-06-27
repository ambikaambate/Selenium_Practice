package SeleniumScripteAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllWindowReverseOder8
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String parentwid = driver.getWindowHandle();
		Set<String> allwinid = driver.getWindowHandles();
		TreeSet<String> list = new TreeSet();
		for(String wid : allwinid)
		{
			driver.switchTo().window(wid);
			list.add(wid);
			driver.close();
		}
		for(String title : list)
		{
			System.out.println(title);
		}
	}
}

