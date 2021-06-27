package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitAction 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("https://my.naukri.com/");
		driver.findElement(By.name("btnK")).submit();
	}

}
