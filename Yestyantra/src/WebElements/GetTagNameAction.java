package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagNameAction {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String tag = driver.findElement(By.partialLinkText("password")).getTagName();
		System.out.println(tag);
	}

}
