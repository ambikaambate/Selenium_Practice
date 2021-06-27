package AllignmentScripte;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckRightAllignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Rectangle rect = driver.findElement(By.id("email")).getRect();
		int x = rect.getX()+rect.getWidth();
		System.out.println(x);
		Rectangle rect1 = driver.findElement(By.id("pass")).getRect();
		int y = rect1.getX()+rect1.getWidth();
		System.out.println(y);
		if (x==y) {
			System.out.println("right angle is perfect");
		}
		else {
			System.out.println("right is not perfect");
		}
	}
}