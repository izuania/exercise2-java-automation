import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import executionTests.Execution;

public class App {
	
	public String baseUrl="https://www.facebook.com/";
	public ChromeDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\CHROMEDRIVER\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get(baseUrl);
	}
	
	@Test(priority=1)
	public void validateUrl() throws InterruptedException{
		String actualMessage =Execution.url(driver);
		Assert.assertEquals(actualMessage, baseUrl);
	}
	
	@Test(priority=2)
	public void validateTitle() throws InterruptedException{
		WebDriverWait drvWait=new WebDriverWait(driver,10);
		WebDriverWait drvWaitForgotButton= new WebDriverWait(driver,10);
		WebDriverWait drvWaitMail= new WebDriverWait(driver,10);
		
		String actualMessage =Execution.title(driver);
		String expectedMessage="Facebook - Log In or Sign Up";
		Assert.assertEquals(actualMessage, expectedMessage);
		
		Execution.signUpButton(driver).click();
		Thread.sleep(5000);
		Execution.firstName(driver).sendKeys("Ari");
		Execution.lastName(driver).sendKeys("Villa");
		Execution.mobile(driver).sendKeys("044000000");
		Execution.password(driver).sendKeys("testing");
		Execution.month(driver).click();
		Execution.day(driver).click();
		Execution.year(driver).click();
		Execution.gender(driver).click();	
		
		Execution.closeButton(driver).click();
		drvWait.until(ExpectedConditions.visibilityOf(Execution.contentText(driver)));
		
		String actualMessage1 =Execution.contentText(driver).getText();
		String expectedMessage1="Connect with friends and the world around you on Facebook.";
		Assert.assertEquals(actualMessage1, expectedMessage1);
		Thread.sleep(3000);
		
		drvWaitForgotButton.until(ExpectedConditions.elementToBeClickable(Execution.forgotPassButton(driver)));
		Execution.forgotPassButton(driver).click();
		String actualMessage2 = Execution.findAccount(driver).getText();
		String expectedMessage2="Find Your Account";
		Assert.assertEquals(actualMessage2, expectedMessage2);
		
		Execution.emailBox(driver).sendKeys("hellomynameisjanedoe123.unosquare@gmail.com");
		drvWaitMail.until(ExpectedConditions.visibilityOf(Execution.searchButton(driver)));
		Execution.searchButton(driver).click();		
		Thread.sleep(3000);
		String actualMessage3 = Execution.noResultText(driver).getText();
		String expectedMessage3="No Search Results";
		Assert.assertEquals(actualMessage3, expectedMessage3);
		
		
		
	}
	
	@AfterClass
	public void endSession(){
		driver.quit();
	}
	
	
	
	

}
