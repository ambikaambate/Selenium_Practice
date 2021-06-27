package AssigmentSeleniumuponFlipkart;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonApp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops",Keys.ENTER);
		
		driver.findElement(By.xpath("//span[contains(text(),'FHD Display Laptop (R5-3500U / 8GB / 512GB SSD / Integrated Graphics / Win 10 + MSO / Dune Color)')]")).click();
		String parentwid = driver.getWindowHandle();
		Set<String> allwid1 = driver.getWindowHandles();
		for(String wid : allwid1){
			driver.switchTo().window(wid);
			}
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.switchTo().window(parentwid);
		
		driver.findElement(By.xpath("//span[contains(text(),'AVITA Essential NE14A2INC433-MB 14')]")).click();
		Set<String> allwid2 = driver.getWindowHandles();
		for(String wid : allwid2){
			driver.switchTo().window(wid);
			}
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.switchTo().window(parentwid);
		driver.findElement(By.xpath("//span[contains(text(),'Lenovo Legion Y540 9th Gen Intel Core')]")).click();
		Set<String> allwid = driver.getWindowHandles();
		for(String wid : allwid){
			driver.switchTo().window(wid);
			}
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.id("hlb-view-cart-announce")).click();
		driver.findElement(By.xpath("(//input[@value='Delete'])[2]")).click();
	}
}  

