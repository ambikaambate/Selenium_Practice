package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_07test {
	@Test
	public void demo(){
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("amjjjhfhj");
		driver.findElement(By.id("pass")).sendKeys("jvjhhh");
		driver.findElement(By.name("login")).click();
	}
}
