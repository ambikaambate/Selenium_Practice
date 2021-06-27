package PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindoWpopUp {

	public static void main(String[] args) throws AWTException, InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get("https://www.yatra.com/");	
		
		Robot robot = new Robot();
	
		
		robot.keyPress(KeyEvent.VK_ALT);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
	
		robot.keyRelease(KeyEvent.VK_ALT);				
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}
}

