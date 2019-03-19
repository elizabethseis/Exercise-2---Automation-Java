package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFacebook extends JavaAutomation2 {
	
@Test
public void ValidatePage() {
	//System.out.println('\n'+"Driver: "+ driver);
	String ActualTittle = driver.getTitle();
	String ExpectedTittle = "Facebook - Log In or Sign Up";
	System.out.println('\n'+"Page Tittle: "+ ActualTittle);
	Assert.assertEquals(ActualTittle, ExpectedTittle);
	WebElement Name =  driver.findElement(By.xpath("//input[@name='firstname']"));
	Name.sendKeys("ELIZABETH");
	WebElement LastName =  driver.findElement(By.xpath("//input[@name='lastname']"));
	LastName.sendKeys("PEREZ");
	WebElement Phone =  driver.findElement(By.xpath("//input[@name='reg_email__']"));
	Phone.sendKeys("4777902377");
	WebElement Password =  driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	Password.sendKeys("Open12345");
	Select DrpDay= new Select(driver.findElement(By.xpath("//select[@id='day']")));
	Select DrpMonth= new Select(driver.findElement(By.xpath("//select[@id='month']")));
	Select DrpYear= new Select(driver.findElement(By.xpath("//select[@id='year']")));
	DrpDay.selectByVisibleText("21");
	DrpMonth.selectByValue("8");
	DrpYear.selectByVisibleText("1988");
	WebDriverWait wait = new WebDriverWait (driver, 60);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Female')]"))).isEnabled();
	WebElement RBFemale= driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
	RBFemale.click();
	String ValidateText=driver.findElement(By.xpath("//h2[@class='inlineBlock _3ma _6n _6s _6v']")).getText();
	String ExpectedText = "Connect with friends and the"  + '\n' + 
			"world around you on Facebook.";
	Assert.assertEquals(ValidateText, ExpectedText);
	System.out.println('\n'+"Text is displayed as : "+ ValidateText);
	WebElement ForgotAccount = driver.findElement(By.xpath("//a[contains(text(),'Forgot account')]"));
	ForgotAccount.click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@ id=\"identify_email\"]"))).isDisplayed();
	String ValidateText1 =driver.findElement(By.xpath("//h2[@class='uiHeaderTitle']")).getText();
	String ExpectedText1 = "Find Your Account";
	Assert.assertEquals(ValidateText1, ExpectedText1);
	System.out.println('\n'+"Text is displayed as : "+ ValidateText1);
	WebElement RecoverAccount = driver.findElement(By.xpath("//input[@id='identify_email']"));
	RecoverAccount.sendKeys("elizabethseis6@hotmail.com");
	WebElement BtnSearch= driver.findElement(By.xpath("//input[@value='Search']"));
	BtnSearch.click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Your search did not return any results')]"))).isDisplayed();
	String ValidateText2 =driver.findElement(By.xpath("//div[contains(text(),'Your search did not return any results')]")).getText();
	String ExpectedText2 = "Your search did not return any results. Please try again with other information.";
	Assert.assertEquals(ValidateText2, ExpectedText2);
	System.out.println('\n'+"Error is displayed as : "+ ValidateText2);
}

}
