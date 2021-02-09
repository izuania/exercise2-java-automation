package executionTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Execution {
	
	private static String text = null;
	private static WebElement element= null;
	
	public static String url(WebDriver driver) {
		text=driver.getCurrentUrl();
		return text;
	}
	
	public static String title(WebDriver driver) {
		text = driver.getTitle();
		return text;		
	}
	
	public static WebElement signUpButton(WebDriver driver) {
		element=driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
		return element;
	}
	
	public static WebElement firstName(WebDriver driver) {
		element=driver.findElement(By.name("firstname"));
		return element;
	}
	
	public static WebElement lastName(WebDriver driver) {
		element=driver.findElement(By.name("lastname"));
		return element;
	}
	
	public static WebElement mobile(WebDriver driver) {
		element=driver.findElement(By.name("reg_email__"));
		return element;
	}
	
	public static WebElement password(WebDriver driver) {
		element=driver.findElement(By.name("reg_passwd__"));
		return element;
	}
	
	public static WebElement month(WebDriver driver) {
		element=driver.findElement(By.cssSelector("#month"));
		return element;
	}
	
	public static WebElement day(WebDriver driver) {
		element=driver.findElement(By.cssSelector("#day"));
		return element;
	}
	
	public static WebElement year(WebDriver driver) {
		element=driver.findElement(By.cssSelector("#year"));
		return element;
	}
	
	public static WebElement gender(WebDriver driver) {
		element=driver.findElement(By.name("sex"));
		return element;
	}
	
	public static WebElement closeButton(WebDriver driver) {
		element=driver.findElement(By.cssSelector("._8idr.img"));
		return element;
	}
	
	public static WebElement contentText(WebDriver driver) {
		element=driver.findElement(By.cssSelector("._8eso"));
		return element;
	}
	
	public static WebElement forgotPassButton(WebDriver driver) {
		element=driver.findElement(By.linkText("Forgot Password?"));
		return element;
	}
	
	public static WebElement findAccount(WebDriver driver) {
		element=driver.findElement(By.cssSelector(".uiHeaderTitle"));
		return element;
	}
	
	public static WebElement emailBox(WebDriver driver) {
		element=driver.findElement(By.cssSelector("#identify_email"));
		return element;
	}
	
	public static WebElement searchButton(WebDriver driver) {
		element=driver.findElement(By.name("did_submit"));
		return element;
	}
	
	public static WebElement noResultText(WebDriver driver) {
		element=driver.findElement(By.cssSelector("._9o4g.fsl.fwb.fcb"));
		return element;
	}
	
	public static WebElement signUpUi(WebDriver driver) {
		element=driver.findElement(By.cssSelector(".registration_redesign"));
		return element;
	}
	
	
	
	
	
	
	

}
