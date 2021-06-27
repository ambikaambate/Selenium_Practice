package DynamicXpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingFlipKart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=poco+x3&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_4_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_4_na_na_na&as-pos=1&as-type=RECENT&suggestionId=poco+x3%7CMobiles&requestId=8f55dad1-adff-4bba-ad3e-95b2d51cf9ad&as-searchtext=POCO");
		driver.findElement(By.name("q")).sendKeys("pocox3");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement ele = driver.findElement(By.xpath("//div[text() = 'POCO X3 (Cobalt Blue, 64 GB)']/../..//div[contains(text(),'14,499')]"));
		System.out.println(ele.getText());
	}
}