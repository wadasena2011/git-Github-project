package AllSelenium_codes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyingTitle {

	
	WebDriver driver;
	 
    @BeforeMethod
     public void setup() {
    	System.setProperty("Webdriver.gecko.driver","C:\\dr\\geckodriver.exe");
    	driver = new FirefoxDriver();
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
    	//driver.get("https://www.carmax.com/");
    	//Assert.assertEquals("carmax", driver.getTitle());
    }
	@Test
	public void gettitle() {
		
	driver.get("https://www.carmax.com/");
	Assert.assertEquals("CarMax - Browse used cars and new cars online", driver.getTitle());
}
}