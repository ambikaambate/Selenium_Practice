package SeleniumScripteAssignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeWindow100To200HightWidth3 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driverssss/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//Dimension diam = driver.manage().window().getSize();
		//System.out.println(diam.getHeight());
		//System.out.println(diam.getWidth());
		Dimension dia = new Dimension(100,200);
		driver.manage().window().setSize(dia);
	}

}
