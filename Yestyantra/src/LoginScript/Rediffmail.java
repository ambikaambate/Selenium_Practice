package LoginScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser is lougnt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("sumanthqsp@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.name("proceed")).click();
		driver.findElement(By.xpath("//b[text()='Write mail']")).click();
		driver.findElement(By.id("TO_IDcmp2")).sendKeys("sumanthqsp@rediffmail.com ");
		driver.findElement(By.xpath("//input[@class='rd_inp_sub rd_subject_datacmp2']")).sendKeys("ambika");
		WebElement framElement = driver.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor')]"));
		driver.switchTo().frame(framElement);
		driver.findElement(By.xpath("//body[@contenteditable]")).sendKeys("practice");
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[text()='Send']")).click();
		

			//	sumanthqsp@rediffmail.com 
				//Testing@123

	}

}
