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

public class CalenderGoibibo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com/");
		
		LocalDateTime ldt = LocalDateTime.now();
		int dayofmonth = ldt.getDayOfMonth();
		String  monthname = ldt.getMonth().toString();
		int year = ldt.getYear();
		String month = monthname.substring(0,1).toUpperCase()+monthname.substring(1,monthname.length()).toLowerCase();
		
		Actions action = new Actions(driver);
		action.click().perform();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.id("departureCalendar")).click();
		
	   	js.executeScript("window.scrollBy(0,150)");
		for(;;){
	   		try{
				driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//div[text()='"+dayofmonth+"']")).click();
				break;
			}catch(NoSuchElementException ele){
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
	 	js.executeScript("window.scrollBy(0,-150)");
	}

}
