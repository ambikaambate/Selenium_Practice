 package AllignmentScripte;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class TopAllignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Rectangle point = driver.findElement(By.id("email")).getRect();
		int y = point.getY();
		int height = point.getHeight();
		int space = 5;
		System.out.println(y+height+space);
		Point point2  = driver.findElement(By.id("passContainer")).getLocation();
		int y1 = point2.getY();
		System.out.println(y1);
		if (y+height+space<y1) {
			System.out.println("perfect");
		}
		else {
			System.out.println("not perfect");
		}

	}

}
