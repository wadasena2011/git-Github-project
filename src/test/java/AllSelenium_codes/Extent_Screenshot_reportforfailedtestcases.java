package AllSelenium_codes;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
public class Extent_Screenshot_reportforfailedtestcases {

	  	WebDriver driver;
		public ExtentReports extent;
		public ExtentTest logger;
		
		/*@BeforeTest
		public void setExtent() {
		 extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/ExtentReport.html",true);	
		 extent.addSystemInfo("Host name","mmm");  // pc user parametrs whuch display with report
		 extent.addSystemInfo("user name","mmm");  // user name of pc 
		 extent.addSystemInfo("Environment","QA");  // which envirnment you tested
		}
		
		@AfterTest
		public void Endreport()
		{
		 extent.flush();
		 extent.close();
}
		public String getScreenshot(WebDriver driver,String screenshotName)
		{
			String dateName = new SimpleDateFormat("yyyMMMdddmmmsss").format(new Date()); // to generate screeshot with date wise
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String destination = System.getProperty("user.dir")+ "/failedTestsScreenshots/" + screenshotName + dateName+".png";
			File finalDestination = new File(destination);
			Fileutils.copyfile(source,finalDestination);
			return destination;
		}
		
		
		
		
		@BeforeMethod
		public void setup() {
			System.setProperty("Webdriver.gecko.driver", "C:\\dr\\geckodriver.exe");
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			driver.get("http://demowebshop.tricentis.com/");  /// If you run this with out test class created, It will not open it
		}
		
		@Test
		public void verifytitel() {
			
		String	title = driver.getTitle();
		System.out.println("Demo Web Shop title" );
		Assert.assertEquals("title", "Demo Web Shop");
		
	}
		@Test
		public void verifyResgistrationpage() {
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click(); //click register button
			driver.findElement(By.name("Gender")).click();                       // gender selection
			driver.findElement(By.id("FirstName")).sendKeys("Alex");  
			driver.findElement(By.id("FirstName")).clear();            // clear first name
			driver.findElement(By.id("LastName")).sendKeys("Alula");           // enter last name
			driver.findElement(By.id("LastName")).clear();
			driver.findElement(By.id("Email")).sendKeys("Alex@yahoo.com");     // enter email
			driver.findElement(By.id("Email")).clear();
			driver.findElement(By.id("Password")).sendKeys("1234");            // enter password
			driver.findElement(By.id("Password")).clear();
			driver.findElement(By.id("ConfirmPassword")).sendKeys("1234");   // confirm password
			driver.findElement(By.id("ConfirmPassword")).clear();
			driver.findElement(By.id("register-button")).click();
			
		
		}
		
		@Test
		public void verifylogin() {
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
			driver.findElement(By.id("Email")).sendKeys("Alex@yahoo.com");
			driver.findElement(By.id("Password")).sendKeys("1234");
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
			
			//Assert.assertEquals(true, "driver.findElement(By.xpath(\"/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input\")).click();");
		}
		

	    @AfterMethod
		public void tearDown() {
			driver.quit();
	    	*/
		
		
}

