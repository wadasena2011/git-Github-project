package AllSelenium_codes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Framecode {

	
	WebDriver driver;
	 
    @BeforeMethod
     public void setup() {
    	System.setProperty("Webdriver.gecko.driver","C:\\dr\\geckodriver.exe");
    	driver = new FirefoxDriver();
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
    	driver.get("URl");
    }
	
    	
    	@Test
    	public void frametest() throws Throwable {
    	driver.switchTo().frame("framename");
    	  Thread.sleep(2000);                                        // you will get frame name by inspecting element 
    	driver.findElement(By.xpath("llllll")). click();
    	
    	
    	// erro happen due to  wrong xpath or has frame.
    	// 
    }
}
