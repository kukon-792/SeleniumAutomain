package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    
	    Robot r=new Robot();
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_T);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_T);
	    
	    String parent = driver.getWindowHandle();
	    System.out.println(parent);
	    
	    Set<String> child = driver.getWindowHandles();
	    System.out.println(child);
	    Thread.sleep(5000);
	    
	    for(String b:child) {
	    	driver.switchTo().window(b);
	    	System.out.println("controlled switched");
	    }
	    driver.get("https://www.amazon.com/");
	    Thread.sleep(5000);
	    
		driver.findElement(By.xpath("//a[text()='Gift Cards']")).click();
		driver.switchTo().window(parent);
		driver.findElement(By.linkText("Forgot Password?")).click();
		driver.quit();
		     	
	    }
	}


