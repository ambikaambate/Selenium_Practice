package webDriver;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetParentChildWindow {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://my.naukri.com/");
		String parentwind =driver.getWindowHandle();
		//System.out.println(parentwind);//to get parent id
		
		Set<String> childwin = driver.getWindowHandles();
		//System.out.println(childwin); // get all window
		for(String window : childwin)
		{
			System.out.println(window);
			driver.switchTo().window(window);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
		
		}
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
	}
}
