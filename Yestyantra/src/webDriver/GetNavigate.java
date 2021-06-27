package webDriver;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetNavigate {

	public static void main(String[] args) throws MalformedURLException 
	{
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.get("https://www.instagram.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("https://www.myntra.com/");
		URL url = new URL("https://www.flipkart.com/");
		driver.navigate().to(url);
	}

}
