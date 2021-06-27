import java.awt.Rectangle;
import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BuyJusApp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverssss/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://byjus.com/");				
	/*	System.out.println(driver.getCurrentUrl());		
		System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
		
		driver.manage().window().fullscreen();
		Point point = driver.manage().window().getPosition();
		System.out.println(point.getX());
		System.out.println(point.getY());
		Point pont = new Point(100,200);
		driver.manage().window().setPosition(pont);
		
		Dimension dia = driver.manage().window().getSize();
		System.out.println(dia.getHeight());
		System.out.println(dia.getWidth());
		Dimension dia1 = new Dimension(100,200);
		driver.manage().window().setSize(dia1);
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		String wid = driver.getWindowHandle();
		Set<String> wids = driver.getWindowHandles();*/
		
		//webelement methods
		/*driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("enterNumber")).sendKeys("4545454743");*/
	/*	String gettag = driver.findElement(By.linkText("Login")).getTagName();		
		System.out.println(gettag);
		
		String gettext = driver.findElement(By.linkText("Login")).getText();
		System.out.println(gettext);
		
		Point point  = driver.findElement(By.linkText("Login")).getLocation();
		System.out.println(point.getX());
		System.out.println(point.getY());
		
		Dimension dia = driver.findElement(By.linkText("Login")).getSize();
		System.out.println(dia.getHeight());
		System.out.println(dia.getWidth());
		
		String atrr = driver.findElement(By.linkText("Login")).getAttribute("value");
		System.out.println(atrr);
		
		String cssprty = driver.findElement(By.linkText("Login")).getCssValue("border-left-color");
		System.out.println(cssprty);*/
		
	/*	File tempfile = driver.findElement(By.linkText("Login")).getScreenshotAs(OutputType.FILE);
		File destfile = new File("./DefectListOfWebElement/loginbutto58n.png");
		tempfile.renameTo(destfile);
		
		TakesScreenshot  ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./DefectListofWebPage/loginwebpage.png");
		temp.renameTo(dest);*/
	/*	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy", 0,10000);*/
		
	
		//WebElement value = driver.findElement(By.xpath("//a[text()='Scholarship']"));
		Actions action = new Actions(driver);
		//action.contextClick().perform();
		WebElement value = driver.findElement(By.xpath("//img[@class='search-icon']"));
		action.sendKeys(value, "english").click(value).perform();
		
		
		
		
		
		
		
		
		

	}

}
