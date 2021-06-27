package SeleniumScripteAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowTitleAlphabeticalOder6 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String parentwid = driver.getWindowHandle();
		Set<String> allwinid = driver.getWindowHandles();
		List<String> list = new ArrayList();
		for(String wid : allwinid)
		{
			driver.switchTo().window(wid);			
			list.add(wid);
		}

		for (int i = list.size(); i >0; i--) {
			driver.switchTo().window(list.get(i));
			driver.close();
			
		}
	}

}
