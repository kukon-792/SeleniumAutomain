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

public class Tc2 {
	public WebDriver driver;
	@BeforeMethod
	public void openapp() {
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	}
	@Test
	public void tc2() {
		driver.findElement(By.linkText("Create a Page")).click();
		String title = driver.getTitle();
		//Assert.assertEquals(title, "678903334");
		//Assert.assertEquals(title, "Facebook");
		SoftAssert s=new SoftAssert();
		s.assertEquals(title, "kukonmiah");
		Reporter.log(title,true);
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
		s.assertAll();
	}
	@AfterMethod
	public void closapp() {
		driver.close();
	}
}
