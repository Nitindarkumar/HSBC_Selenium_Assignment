package seleniumaasignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TextWithoutUsingSendkeys {
	String dragdropUrl = "https://jqueryui.com/droppable/";
	
	WebDriver driver;	
	 
	 @BeforeClass
		public void setBaseURL(){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nitin_Rathod\\eclipse-workspace\\Aasignment\\drivers\\chromedriver.exe"); 
		    driver =new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		    driver.manage().window().maximize(); 
	 }
	 @Test
	    public void WithoutSenkeysM() {
	    	driver.get(dragdropUrl);
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	    	WebElement search = driver.findElement(By.xpath("//input[@class='ds-input']"));
	    	
			js.executeScript("arguments[0].value = 'droppable'" , search);
	    }
	 @AfterTest
		public void WebDriverClosure() {
			driver.quit();
		}
}
