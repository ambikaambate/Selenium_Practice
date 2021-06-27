package ExploringApplication;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacBookApp {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "./driverssss/Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		/*driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		Dimension getsize = driver.manage().window().getSize();
		Dimension dia = new Dimension(200,100);
		System.out.println(dia.getHeight());
		System.out.println(dia.getWidth());
		
		Point position = driver.manage().window().getPosition();
		Point position1 = new Point(52,58);
		System.out.println(position1.getX());
		System.out.println(position1.getY());
		driver.navigate().to("https://www.facebook.com/");				
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		URL url = new URL("https://www.naukri.com/");
		driver.navigate().to(url);*/
		
		driver.get("https://www.naukri.com/");
		String getid = driver.getWindowHandle();
		System.out.println(getid);
		Set<String> allwid =driver.getWindowHandles();
		System.out.println(allwid);
		for(String window : allwid)
		{
			System.out.println(window);
			driver.switchTo().window(window);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.close();
		
		}
	}
}