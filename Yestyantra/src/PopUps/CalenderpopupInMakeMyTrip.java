package PopUps;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class CalenderpopupInMakeMyTrip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driverssss/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		LocalDateTime LDT = LocalDateTime.now();
		int year = LDT.getYear();
		
		String monthName = LDT.getMonth().toString();
		String month=monthName.substring(0, monthName.length()-2).toUpperCase()+monthName.substring(1,monthName.length()).toLowerCase();
		int day=LDT.getDayOfMonth();
		Actions actions=new Actions(driver);
		actions.click().perform();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,100);");
		driver.findElement(By.xpath("//input[@id='departure']/..")).click();
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//p[text()='"+day+"']")).click();
				break;
			}catch(NoSuchElementException e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		js.executeScript("window.scrollTo(0,-100);");
	}

}