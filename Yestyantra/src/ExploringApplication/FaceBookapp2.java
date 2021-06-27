package ExploringApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookapp2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("gjhfghdfj");
		driver.findElement(By.name("pass")).sendKeys("jhfjhgfh");
		driver.findElement(By.name("login")).click();
		String gettext = driver	.findElement(By.linkText("Create a Page")).getText();
		System.out.println(gettext);
		String gettag = driver.findElement(By.partialLinkText("Forgotten")).getTagName();
		System.out.println(gettag);
		driver.findElement(By.tagName("email")).click();
		driver.findElement(By.className("8esh")).click();
		Dimension getsize1 = driver.findElement(By.id("email")).getSize();
		System.out.println(getsize1.getHeight());
		System.out.println(getsize1.getWidth());
		Point getloc = driver.findElement(By.id("email")).getLocation();
		System.out.println(getloc.getX());
		System.out.println(getloc.getY());
		Rectangle rec = driver.findElement(By.id("email")).getRect();
		System.out.println(rec.getHeight());
		System.out.println(rec.getWidth());
		System.out.println(rec.getX());
		System.out.println(rec.getY());
		
		String getcss = driver.findElement(By.id("email")).getCssValue("appearance");
		System.out.println(getcss);
		
		String attrvalue = driver.findElement(By.name("login")).getAttribute("value");
		System.out.println(attrvalue);
		
		/*driver.findElement(By.name("sex")).isEnabled();
		driver.findElement(By.name("sex")).isDisplayed();
		driver.findElement(By.name("sex")).isSelected();
		driver.findElement(By.name("sex")).click();*/
		
		driver.findElement(By.cssSelector("input[id='email']")).click();
		driver.findElement(By.xpath("//a[text()='Create a Page']")).click();

	}

}
