package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	    driver.manage().window().maximize();
	    
	    Robot r=new Robot();
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_WINDOWS);
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_WINDOWS);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    Thread.sleep(5000);
	    //this is maximize and minimize window

	}

}
