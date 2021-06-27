package PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class WindowPopUpS {
	public static void main(String[] args) throws InterruptedException, AWTException {
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ALT);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
					
			
					
			
		
	}
}
