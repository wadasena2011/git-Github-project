package Selenium_Alert.Alertncodes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class scrollpages {

	
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
	
	
    //1. using pixel
    	//URL
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0, 1000)","");
    	
    	//2. scrolling pages untill we find element
    	//URL
    	JavascriptExecutor js3 = (JavascriptExecutor)driver;
    	WebElement  ale= driver.findElement(By.xpath("mmmm")); // element found all way the down need to be seen
    	js.executeScript("argument[0].scrollIntoView();",ale);
    	
    	//.3 scroll till bottom
    	
    	//Url
    	JavascriptExecutor js1 = (JavascriptExecutor)driver;
    	js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    	
    	
    	
    }	
}
