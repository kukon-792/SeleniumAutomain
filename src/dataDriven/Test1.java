package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./kmsoftware/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	   
	    FileInputStream f=new FileInputStream("./data/exceldata.xlsx");
	    Workbook wb = WorkbookFactory.create(f);
	    String url = wb.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
	    
	    driver.get(url);
	    String us = wb.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
	    driver.findElement(By.id("username")).sendKeys(us);
	    
	    String pwd = wb.getSheet("sheet1").getRow(1).getCell(2).getStringCellValue();
	    driver.findElement(By.name("pwd")).sendKeys(pwd);
	  //data will read from the excel sheet
	}

}
