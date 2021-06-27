package DynamicXpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumUsingDynamicXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		String gettect = driver.findElement(By.xpath("//td[text()='Java']/..//td[@data-label='Beta Release Date']")).getText();
		System.out.println(gettect);

	}

}
