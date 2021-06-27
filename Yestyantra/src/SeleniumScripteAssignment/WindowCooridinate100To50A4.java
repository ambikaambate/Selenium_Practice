package SeleniumScripteAssignment;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowCooridinate100To50A4
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//Point pnt = driver.manage().window().getPosition();
		//System.out.println(pnt.getX());
		//System.out.println(pnt.getY());
		Point pnts = new Point(100,50);
		driver.manage().window().setPosition(pnts);
		
	}

}
