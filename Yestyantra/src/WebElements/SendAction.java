package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendAction 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("ambika");
		driver.findElement(By.id("pass")).sendKeys("1235");
		driver.findElement(By.name("login")).click();
		
	}
}
