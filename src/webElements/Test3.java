package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//how to get codinate of the user element
public class Test3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.actitime.com/login.do");
	    
	    WebElement ele = driver.findElement(By.id("username"));
	    Point x = ele.getLocation();
	    System.out.println(x.getX());
	    System.out.println(x.getY());

	}

}
