package JavascriptExcutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterTheValueToDisableTextfield {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		WebElement disablebutton = driver.findElement(By.xpath("//input[@class='form-control']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='fgfgcffdf';", disablebutton);
		Thread.sleep(2000);
		String value = (String) js.executeScript("return arguments[0].value", disablebutton);
		System.out.println(value);
		
		

	}

}
