package Synchronization;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlywaitMethod1 {

	public static void main(String[] args) {
		String ltd = LocalDateTime.now().toString().replace(":", "-");
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("abcdjf");
		driver.findElement(By.name("password")).sendKeys("254");
		
		
		//or here it can some mistae in pass elemt then it will though ecception.
		/*	driver.get("https://www.instagram.com/");
		 System.out.println(LocalDateTime.now());
		try{
		driver.findElement(By.name("passwor")).sendKeys("254");
		}catch(NoSuchElementException ele){
			System.out.println(LocalDateTime.now());
			System.out.println("element is not present");
		}*/

		
	}

}
