package webDriver;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetHandles 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		int count = 0;
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String parentwids = driver.getWindowHandle(); //to get window id
		Set<String> allWids = driver.getWindowHandles(); //to get all windows child and parent
		allWids.remove(parentwids);
		
		for(String wid : allWids) //for sequence oder 
		{
			driver.switchTo().window(wid); //switching parants to child
			String a = driver.getTitle(); //getting tiltle of child window
			System.out.println(driver.getTitle()); //getting 
			if(a.equals("Cognizant"))
			{
				driver.close();
		}
			System.out.println(driver.getWindowHandle());
			driver.close();
			driver.switchTo().window(parentwids);
			System.out.println(driver.getTitle());
			}
		driver.quit();
	}
	
}
