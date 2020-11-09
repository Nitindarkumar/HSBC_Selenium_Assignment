package seleniumaasignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GSearchWebpage {
	//Url
		String googleSearchWebpage= "http://www.google.com";
		
		WebDriver driver;
	@Test
    public void GoogleSearchWebpageM() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nitin_Rathod\\eclipse-workspace\\Aasignment\\drivers\\chromedriver.exe"); 
	    driver =new ChromeDriver();
		driver.get(googleSearchWebpage);
    	driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys("selenium");
    	
    	//Collect numbers of elements 
    	List<WebElement> listObject = driver.findElements(By.xpath("//*[@role='listbox']//li/descendant::div[//*[@class='sbl1']]"));
    	System.out.println("Number of suggestion:" +listObject.size());
    	
    	for(int i =0; i<listObject.size(); i++) {
    		System.out.println(listObject.get(i).getText());
    		if (listObject.get(i).getText().contains("selenium interview questions")) {
				listObject.get(i).click();
				//element will be find then break the loop
				break;
			}
    	}
    }
	
}
