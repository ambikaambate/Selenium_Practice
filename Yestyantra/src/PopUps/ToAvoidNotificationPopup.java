package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToAvoidNotificationPopup {

			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver","./driverssss/chromedriver.exe");
//				WebDriver driver=new ChromeDriver();
				ChromeOptions options=new ChromeOptions();
				options.addArguments("--disable-notifications");
				WebDriver driver=new ChromeDriver(options);
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        driver.get("https://www.naukri.com/");
			}

		}
