import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OlaApp {

	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "./driverssss/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.olacabs.com/");
		//WEbdriver method
		/*System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());*/
		/*driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("https://www.flipkart.com/");
		URL url = new URL("https://www.amazon.in/");
		driver.navigate().to(url);*/
	/*	String wid = driver.getWindowHandle();
		driver.findElement(By.linkText("Ola Drive")).click();
		driver.switchTo().window(wid);*/
		
		/*driver.get("https://www.olacabs.com/ola-drive");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy", 0,1000);*/
		
		//WebElement Methods
		driver.findElement(By.xpath("//div[text()='Enter drop for ride estimate']")).click();
		driver.findElement(By.id("addressInput")).sendKeys("bidar",Keys.DELETE);
		
		

	}

}
