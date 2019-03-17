package Tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class JavaAutomation2 {
public static WebDriver driver;
String URL= "https://www.Facebook.com";

@BeforeTest
	public void OpenPage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\elizabeth.perez\\eclipse-workspace\\Automation2\\src\\main\\java\\Drivers\\chromedriver.exe");
		 driver  = new ChromeDriver();
		driver.get(URL);	
	}

@AfterTest
public void ClosePage() {
	driver.close();	
}

}
