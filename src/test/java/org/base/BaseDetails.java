package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDetails {
	public static WebDriver driver;
	public static void launchBrowser(String browser) {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
	}
	
	public static void launchUrl(String a) {
		driver.get(a);
		driver.manage().window().maximize();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String title = driver.getTitle();
		System.out.println(title);

	}
	
	public static void fillTheBox(WebElement text, String value) {
		text.sendKeys(value);
	//C:\Users\USER\eclipse-workspace\FormTaskOnCucumber\src\test\resources\Excel\form register.xlsx	

	}
	public static String getDataFromExcel(String FileName,String sheetName,int rowNum,int cellNum) throws IOException {
		File f =new File ("C:\\Users\\USER\\eclipse-workspace\\FormTaskOnCucumber\\src\\test\\resources\\Excel\\"+FileName+".xlsx");
		FileInputStream fis = new 	FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheet = w.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		int cellType = cell.getCellType();
		String value;
		if (cellType==1) {
			value = cell.getStringCellValue();
			
		}
		
		else if (DateUtil.isCellDateFormatted(cell)) {
		Date dateCellValue = cell.getDateCellValue();
		SimpleDateFormat s = new SimpleDateFormat("dd-MM-YYYY");
		value=s.format(dateCellValue);
		}
		else {
			double numericCellValue = cell.getNumericCellValue();
			long l =(long)numericCellValue;
			value=String.valueOf(l);
			
		}
			return value;
	}

	public static void clickFemaleBtn(WebElement femalebtn) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",femalebtn);
		
	}
	
	

	/*public static void dateOfBirth(WebElement dob, String value) throws IOException {
		dob.sendKeys(value +Keys.ENTER);
		
		
	}*/
		
	public static void clickHobbies(WebElement hobbie) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",hobbie);
	}
	
	public static void dropDownState(WebElement state ) {
		Select s = new Select(state);
		s.selectByIndex(1);
		List<WebElement> options = s.getOptions();
		for (WebElement x : options) {
			System.out.println(x.getText());
		}
	
	}
	public static void dropDowncity(WebElement city) {
		Select s = new Select(city);
		s.selectByIndex(1);
		
		List<WebElement> options = s.getOptions();
		for (WebElement x : options) {
			System.out.println(x.getText());
		}
	}
	public static void submitbtn(WebElement submit) {
		submit.submit();
		

	}

}
