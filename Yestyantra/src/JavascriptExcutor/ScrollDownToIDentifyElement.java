package JavascriptExcutor;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownToIDentifyElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/doodles");;
		JavascriptExecutor js = (JavascriptExecutor)driver;
		for(;;){
			try{
			driver.findElement(By.linkText("Teachers' Day 2020 (November 1)")).click();
			break;
			}
			catch(NoSuchElementException ele){
				js.executeScript("window.scrollBy(0,1000)");
				Thread.sleep(2000);
			}
		}
		
	}
}