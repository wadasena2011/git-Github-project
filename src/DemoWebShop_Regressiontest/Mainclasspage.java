package DemoWebShop_Regressiontest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mainclasspage {
	public WebDriver driver;


	public static void main(String[] args) {
		
     System.setProperty("webdriver.gecko.driver", "C:\\dr\\geckodriver.exe");
     WebDriver driver=new FirefoxDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
     
     Browserclass B = new Browserclass();
     B.bro();
     
     
	}
	}
