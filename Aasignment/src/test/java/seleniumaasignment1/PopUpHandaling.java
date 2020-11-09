package seleniumaasignment1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopUpHandaling {
@Test

public void PopUp() throws InterruptedException {
	//WebDriver driver;	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nitin_Rathod\\eclipse-workspace\\Aasignment\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get("http://popuptest.com/goodpopups.html");
	driver.findElement(By.xpath("//a[@href='http://www.popuptest.com/popup3.html']")).click();
	
	Thread.sleep(2000);
	
	//for two window handling main window n popup window
	Set<String> windowHandler=driver.getWindowHandles();
	Iterator<String> iterObj = windowHandler.iterator();
	
	String mainwindow = iterObj.next();
	System.out.println("Main window:"+mainwindow);
	String popupwindow = iterObj.next();
	System.out.println("Popup window:"+popupwindow);
	
	//Switch to popup window
	driver.switchTo().window(popupwindow);  
	Thread.sleep(2000);
	System.out.println("Popup window title:" +driver.getTitle());
	
	driver.close();
	
	//again switch to main window
	driver.switchTo().window(mainwindow);	    
	Thread.sleep(2000);
	System.out.println("Main window title:" +driver.getTitle());
	driver.quit();
}

}
