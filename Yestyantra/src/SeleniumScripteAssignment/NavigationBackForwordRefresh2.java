package SeleniumScripteAssignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationBackForwordRefresh2 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com/");
		driver.get("https://www.instagram.com/");
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.navigate().back();
	}

}
