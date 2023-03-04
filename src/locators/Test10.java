package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.actitime.com/login.do");
	    
	    driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    driver.findElement(By.xpath("//div[text()='Login ']")).click();
	    
	    String title = driver.getTitle();
	    System.out.println(title);
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    //verification
	    //this is default question, right a any login scripts
	    
	    if(title.equals("actiTIME - Login")) {
	    	System.out.println("Pass:home page is dispalyed");
	    }
	    else 
	    {
	    	System.out.println("fail:home page is not dispalyed");
	    driver.close();
	
	    }  
	    
	    
	}


}


