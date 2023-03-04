package popups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.naukri.com");
	    
	    String parent = driver.getWindowHandle();
	    System.out.println(parent);
	    Set<String> child = driver.getWindowHandles();
	    System.out.println(child);
	    System.out.println(child.size());
	    
	    for(String b:child) {
	    	driver.switchTo().window(b);
	    	String t = driver.getTitle();
	    	System.out.println(t);
	    }
	    driver.quit();
	    //this is close all windows 

	}

}
