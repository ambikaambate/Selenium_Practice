package ActionsClass;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingKeyDownAndKeyUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/personal-care");
		List<WebElement> wid = driver.findElements(By.xpath("//div[@class='desktop-navLink']/../..//a[@data-group='beauty']"));
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).click().perform();
		for(WebElement wids : wid){
			action.click(wids).perform();
		}
		action.keyUp(Keys.CONTROL).perform();
	}

}
