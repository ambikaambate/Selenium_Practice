package webDriver.SeleniumAssigment4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheToolTipOfTheElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testproject.io/");
		String tooltip = driver.findElement(By.xpath("//a[text()='Forum']")).getAttribute("Title");
		System.out.println(tooltip);
		
	}

}
