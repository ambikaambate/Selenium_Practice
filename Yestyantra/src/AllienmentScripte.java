import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllienmentScripte {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Point  usernamepoint = driver.findElement(By.id("email")).getLocation();
		Point passwordpoint = driver.findElement(By.name("pass")).getLocation();
		int unpoint = usernamepoint.getX();
		int pwdpoint = passwordpoint.getX();
		if (unpoint == pwdpoint) {
			System.out.println("it is left allignment");
		}
		else {
			System.out.println("it is not left allignment");
		}
	}

}
