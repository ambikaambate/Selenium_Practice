package SelectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetParticularNoMonth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/r.php");
		/*WebElement month = driver.findElement(By.id("month"));
		Select select = new Select(month);
		List<WebElement> allmonth = select.getOptions();
		allmonth.get(2).click();*/
		
		/*WebElement day = driver.findElement(By.id("day"));
		Select select1 = new Select(day);
		List<WebElement> allday = select1.getOptions();
		allday.get(4).click();*/
		
		WebElement year = driver.findElement(By.id("year"));
		Select select2 = new Select(year);
		List<WebElement> allyear = select2.getOptions();
		allyear.get(1).click();
		
	}

}
