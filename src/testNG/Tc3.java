package testNG;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Tc3 {
	public WebDriver driver;
	@BeforeMethod
	public void openapp() {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	}
	@Test
	public void tc2() {
		driver.findElement(By.linkText("Create a Page")).click();
		String title = driver.getTitle();
	    Assert.assertEquals(title,"34567");
		//SoftAssert s=new SoftAssert();
		//s.assertEquals(title,"Facebook");
		Reporter.log(title,true);
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
		//s.assertAll();
	}
	@AfterMethod
	public void closapp() {
		driver.close();
		//this fail test cases to verification or validation
	}
}



