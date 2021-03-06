package seleniumaasignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SetWindowSize {
	String dragdropUrl = "https://jqueryui.com/droppable/";
	
	WebDriver driver;	
	 
	 @BeforeClass
		public void setBaseURL(){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nitin_Rathod\\eclipse-workspace\\Aasignment\\drivers\\chromedriver.exe"); 
		    driver =new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    driver.manage().window().maximize(); 
	 }
	 @Test
	    public void SetSizeWindowM() {
	    	driver.get(dragdropUrl);
	    	Dimension dimen = new Dimension(600,1000);
	     	//Resize current window to the set dimension
	     	driver.manage().window().setSize(dimen);
	 }
	 @AfterTest
		public void WebDriverClosure() {
		//	driver.quit();
		}
}
