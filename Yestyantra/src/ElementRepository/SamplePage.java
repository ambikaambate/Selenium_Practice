package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamplePage {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./driverssss/Chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/index.php");
		
		LoginPage loginPage = new  LoginPage(driver);
		WebDriver valua = loginPage.getUsernameTesxField().sendkeys("admin");
		WebDriver valua1 = loginPage.getPasswordTextField();

		//driver.navigate().refresh();
		//loginPage.getUsernameTesxField();
		//loginPage.getPasswordTextField();
	}

}
