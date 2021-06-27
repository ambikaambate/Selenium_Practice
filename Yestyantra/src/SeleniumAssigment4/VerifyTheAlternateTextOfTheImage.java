package SeleniumAssigment4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheAlternateTextOfTheImage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String altrnatename = driver.findElement(By.xpath("//img[@alt='Flipkart']")).getAttribute("alt");
		System.out.println(altrnatename);
	}

}
