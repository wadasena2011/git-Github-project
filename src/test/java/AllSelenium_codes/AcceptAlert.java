package AllSelenium_codes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AcceptAlert {

	
	
	WebDriver driver;
	 
    @BeforeMethod
     public void setup() {
    	System.setProperty("Webdriver.gecko.driver","C:\\dr\\geckodriver.exe");
    	driver = new FirefoxDriver();
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
    	driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
    	
    }
    	@Test
    	public void checkout() {
    		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div[2]/div[4]")).click();
    		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div[3]/div[4]")).click();
    		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[3]")).click();
    		Alert alert = driver.switchTo().alert();
    		System.out.println(alert.getText());
    		alert.accept();
    	}
    	
    	
    	
    	@AfterMethod
    	public void tearDown() {
    		driver.quit();
    		
    	}
    }
	

