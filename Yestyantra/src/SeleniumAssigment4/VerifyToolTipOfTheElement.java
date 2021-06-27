package SeleniumAssigment4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyToolTipOfTheElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testproject.io/");
		String textvalue = driver.findElement(By.xpath("//a[text()='Forum']")).getAttribute("title");
		System.out.println(textvalue);
	}

}
