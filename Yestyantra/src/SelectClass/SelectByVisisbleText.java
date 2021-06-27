package SelectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisisbleText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/r.php");
		WebElement month = driver.findElement(By.id("month"));
		Select select = new Select(month);
		select.selectByVisibleText("Dec");
		
		WebElement daylist =driver.findElement(By.id("day"));
		Select selectday = new Select(daylist);
		List<WebElement> alllist = selectday.getOptions();
		for(WebElement link : alllist){
			selectday.selectByVisibleText(link.getText());
			
		}
		
	}

}
