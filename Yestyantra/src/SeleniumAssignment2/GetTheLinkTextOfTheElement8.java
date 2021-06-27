package SeleniumAssignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTheLinkTextOfTheElement8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String lingtext = driver.findElement(By.linkText("Forgotten password?")).getText();
		System.out.println(lingtext);

	}

}
