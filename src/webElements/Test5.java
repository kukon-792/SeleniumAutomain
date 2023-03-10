package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.actitime.com/login.do");
	    //this is for verification
	    
	    WebElement ele = driver.findElement(By.id("username"));
	    if(ele.isDisplayed()) {
	    	System.out.println("pass:element is dispalyed");
	    	ele.sendKeys("admin");
	    }
        
	    else {
	    	System.out.println("fail:element is not displayed");
	    }
	    WebElement ele2 = driver.findElement(By.id("keepLoggedInCheckBox"));
	    if(ele2.isDisplayed()) {
	    	System.out.println("pass: is is selected");
	    }
	    else {
	    	System.out.println("fail: it is not selected");
	    }
	    WebElement ele1 = driver.findElement(By.xpath("//div[text()='Login ']"));    
	    if(ele1.isEnabled()) {
	    	System.out.println("pass:element is enabled");
	    	ele1.click();
	    }
	    else 
	    {
	    	System.out.println("fail:element is not enabled");
	    }
	
	}
}
