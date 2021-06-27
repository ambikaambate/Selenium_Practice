package PopUps;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopUpInClearTrip {

			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver","./driverssss-/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				String month="August";
				int Day=23;
				int year=2021;
				driver.get("https://www.cleartrip.com/");
		        driver.findElement(By.id("DepartDate")).click();
		        for(;;) {
		        	try {
		        		 driver.findElement(By.xpath("//span[text()='"+month+"']/following-sibling::span[text()='"+year+"']/../../..//a[text()='"+Day+"']")).click();
		        		 break;
		        	}catch(NoSuchElementException e) {
		        		driver.findElement(By.xpath("//a[@class='nextMonth ']")).click();
		        	}
		        }
			}

		}
