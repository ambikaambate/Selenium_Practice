package JavascriptExcutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnDisableButton {




	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.oracle.com/in/java/technologies/javase/javase-jdk8-downloads.html");
		driver.findElement(By.linkText("jdk-8u291-linux-aarch64.tar.gz")).click();
		WebElement links = driver.findElement(By.linkText("Download jdk-8u291-linux-aarch64.tar.gz"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	
		js.executeScript("arguments[0].click();",links);
		Thread.sleep(2000);
		}

}
