package AllSelenium_codes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class payment_test {

	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("Webdriver.gecko.driver", "C:\\dr\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.get("https://www.paymentvision.com/");
	}
		
		
		@Test
		public void Alertallow() {
			driver.findElement(By.xpath("//*[@id=\"menu-item-177\"]/a")).click();
			Alert alert= driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
			
		}
		
		
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		
		
		
	}
}
