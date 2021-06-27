package DynamicXpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTCUsingDynamicXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctctourism.com/contactUs");
		String gettext = driver.findElement(By.xpath("//td[contains(text(),'Express')]/..//td[text()='8287930030']")).getText();
		System.out.println(gettext);

	}

}
