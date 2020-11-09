package seleniumaasignment1;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DragDrop {
	
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
	    public void DragnDrop() throws InterruptedException	{
	    	
	    	driver.get(dragdropUrl);
	    	
	        //Using scrolling window
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	 		js.executeScript("window.scrollBy(0,200)");	         
	        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));	            		
	        WebElement From=driver.findElement(By.xpath("//*[@id='draggable']"));		      	    		
	        WebElement toElement=driver.findElement(By.xpath("//*[@id='droppable']"));									
	        Actions act=new Actions(driver);
	        act.dragAndDrop(From, toElement).build().perform();	        
	    }
	   @AfterTest
		public void WebDriverClosure() {
			driver.quit();
		}		
}
