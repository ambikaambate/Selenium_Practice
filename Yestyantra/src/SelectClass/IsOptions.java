package SelectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/r.php");
	/*	WebElement day = driver.findElement(By.id("day"));
		Select select = new Select(day);
		List<WebElement> days = select.getOptions();
		for(WebElement alldays : days){
			System.out.println(alldays.getText());
		}*/
		
		WebElement month = driver.findElement(By.id("month"));
		Select select1 = new Select(month);
		List<WebElement> allmoth = select1.getOptions();
		for(WebElement allmothlist : allmoth){
			System.out.println(allmothlist.getText());
		}

	}

}
