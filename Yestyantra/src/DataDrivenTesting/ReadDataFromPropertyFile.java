package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromPropertyFile {
	public static void main(String[] args) throws IOException, InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    
		FileInputStream fis = new FileInputStream("./TestData/data.properties");
		Properties properties = new Properties();
		properties.load(fis);
		String  urldata = properties.getProperty("url");
		String usernamedata = properties.getProperty("username");
		String passworddata = properties.getProperty("password");
		
		System.out.println(urldata);
		System.out.println(usernamedata);
		System.out.println(passworddata);
		
		driver.get(urldata);
		driver.findElement(By.id("email")).sendKeys("usernamedata");
		driver.findElement(By.name("pass")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();

	}

}
