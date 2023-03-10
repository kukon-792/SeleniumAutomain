package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
	    WebElement ele = driver.findElement(By.id("gh-cat"));
	    Select s=new Select(ele);
	    s.selectByIndex(4);
	    Thread.sleep(3000);
	    s.selectByValue("550");
	    Thread.sleep(3000);
	    s.selectByVisibleText("Business & Industrial");
	    Thread.sleep(3000);
	    driver.close();
	  //DeSelecting option not available in single DropDown
	    s.deselectAll();
	}

}
