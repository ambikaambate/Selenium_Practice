package WebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationAction {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Point point  = driver.findElement(By.id("headerContainer")).getLocation();
		System.out.println(point.getX());
		System.out.println(point.getY());
		

	}

}