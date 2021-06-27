package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeAction {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Dimension dia = driver.findElement(By.id("pass")).getSize();
		System.out.println(dia.getHeight());
		System.out.println(dia.getWidth());
		
		Dimension dia1 = driver.findElement(By.name("login")).getSize();
		System.out.println(dia1.getHeight());
		System.out.println(dia1.getWidth());
		
	}

}
