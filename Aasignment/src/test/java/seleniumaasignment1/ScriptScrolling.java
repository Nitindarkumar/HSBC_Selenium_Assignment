package seleniumaasignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ScriptScrolling {
	//Url
		String scrollUrl = "https://www.rahulshettyacademy.com/#/index";
		//http://openclinic.sourceforge.net/openclinic/home/index.php site is blocked hence use other URL
			
		WebDriver driver;	
		 
		 @BeforeClass
			public void setBaseURL(){
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nitin_Rathod\\eclipse-workspace\\Aasignment\\drivers\\chromedriver.exe"); 
			    driver =new ChromeDriver();
			    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			    driver.manage().window().maximize();
		 }
   		 @Test
		 public void ScrollScript() {
			 driver.get(scrollUrl);
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("window.scrollBy(0,600)");
   		 }
   		 @AfterTest
   		 public void WebDriverClosure() {
   			driver.quit();
   		}
}
