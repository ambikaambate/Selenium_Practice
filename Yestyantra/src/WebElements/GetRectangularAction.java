
package WebElements;




import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectangularAction {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Rectangle rec = driver.findElement(By.name("search")).getRect();
		System.out.println(rec.getHeight());
		System.out.println(rec.getWidth());
		System.out.println(rec.getX());
		System.out.println(rec.getY());
	}

}
