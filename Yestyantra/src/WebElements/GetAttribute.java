package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String attrvalue = driver.findElement(By.name("login")).getAttribute("value");
		System.out.println(attrvalue);
		/*String actuadata = "ElfBatch";
		driver.findElement(By.id("email")).sendKeys("actuadata");
		String enterdata = driver.findElement(By.id("email")).getAttribute("value");
		if(actuadata.equals(enterdata)) {
			System.out.println("the actual data is properly enterde");
		}
		else {
			System.out.println("the actual data is not properly entre");
		}*/
	}
}
