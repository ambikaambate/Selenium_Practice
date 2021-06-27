package ElementOnElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementonEle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		String der = driver.findElement(By.xpath("//a[text()='Downloads']")).findElement(By.xpath("//td[text()='Java']")).getText();
		System.out.println(der);
	}
}
