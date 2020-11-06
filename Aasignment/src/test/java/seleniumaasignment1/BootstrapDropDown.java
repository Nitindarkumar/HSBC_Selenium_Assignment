package seleniumaasignment1;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BootstrapDropDown {


	@Test
	public void funct() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nitin_Rathod\\eclipse-workspace\\Aasignment\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.className("multiselect-selected-text")).click();
	
 		
 		List<WebElement> listdrop=  driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a//label"));
 		System.out.println(listdrop.size());
		
		 for(int i =0; i<listdrop.size(); i++) {
		 System.out.println(listdrop.get(i).getText()); if
		 (listdrop.get(i).getText().contains("Bootstrap")) { listdrop.get(i).click();
		 break; } 
	}
		
	}
}
