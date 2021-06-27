package DynamicXpathLocator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IentifyTheLastLinkOfThePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		List<WebElement> alllinks = driver.findElements(By.xpath("(//a)[last()]"));
		System.out.println(alllinks);


	}

}
