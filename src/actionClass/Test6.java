package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.com/");
	    
	    WebElement ele = driver.findElement(By.id("tophf"));
	    Actions a=new Actions(driver);
	    a.contextClick(ele).perform();
	    //this is contextClick

	}

}
