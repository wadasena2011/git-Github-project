package AllSelenium_codes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Mouth_Hover {

	
	WebDriver driver;
	 
    @BeforeMethod
     public void setup() {
    	System.setProperty("Webdriver.gecko.driver","C:\\dr\\geckodriver.exe");
    	 driver = new FirefoxDriver();
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
    	driver.get("https://www.carmax.com/");
    }
    
   /*@Test
    public void clickShoplink() throws InterruptedException{
    	
    	WebElement ale =driver.findElement(By.id("header-mobile-drawer-focus-start"));
    	Actions act = new Actions(driver);
    	act.moveToElement(ale).build().perform();
    	*/
    
   
       // Thread.sleep(4000);
       // driver.switchTo().frame("rlcdn");
        //@Test
        //public void verifysearchtextbox() {
        	//driver.findElement(By.id("header-inventory-search")).sendKeys("Power Locks");
        	//Actions n = new Actions(driver);
        	//WebElement getu= driver.findElement(By.xpath("/html/body/div[1]/header/section/form/div[1]/div/button/svg"));
        	//n.moveToElement(getu).build().perform();
            //driver.findElement(By.xpath("/html/body/main/section[2]/div[2]/form/div/div[1]/ul/li[1]"));
         
        
        @Test
        public void verifyselllink() {
        	Actions act = new Actions(driver);
        	WebElement km=driver.findElement(By.xpath("/html/body/div[1]/header/nav/section[1]/div/aside/div[2]/a[2]"));
        	
        	act.moveToElement(km).build().perform();
        	driver.findElement(By.linkText("Get Started")).click();
        	
        	//driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]/div[2]/div/div/div/div/div/div[2]/div[2]/span")).click();
        }
     
    @AfterMethod
    public void tearDown() {
   	driver.quit();
    	
    }
}
