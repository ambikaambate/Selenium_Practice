package AssigmentSeleniumuponFlipkart;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("redmi 9",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='REDMI 9 (Sporty Orange, 128 GB)']")).click();
		Thread.sleep(2000);
		Set<String> allTabs = driver.getWindowHandles();
		for(String tabCon : allTabs) {
			driver.switchTo().window(tabCon);
		}
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Flipkart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone11",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.linkText("APPLE iPhone 11 (Black, 64 GB)")).click();
		Thread.sleep(2000);
		Set<String> tabIphone = driver.getWindowHandles();
		for(String tabI : tabIphone) {
			driver.switchTo().window(tabI);
		}
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Flipkart']")).click();
		driver.findElement(By.name("q")).sendKeys("poco",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='POCO M3 (Cool Blue, 64 GB)']")).click();
		Set<String> pocoTab = driver.getWindowHandles();
		for(String poct : pocoTab) {
			driver.switchTo().window(poct);
		}
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='APPLE iPhone 11 (Black, 64 GB)']/../../../..//div[text()='Remove']")).click();
		driver.findElement(By.xpath("//div[text()='Cancel']/..//div[text()='Remove']")).click();
	}
}