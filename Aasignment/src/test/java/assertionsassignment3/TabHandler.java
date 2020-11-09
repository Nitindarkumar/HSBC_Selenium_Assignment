package assertionsassignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TabHandler {
	static WebDriver driver;

	@BeforeClass
	public void setBaseURL() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nitin_Rathod\\eclipse-workspace\\Aasignment\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	}

	@Test
	public void handlingTab() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"opentab\"]")).click();

		System.out.println("New Tab Swiched ");
	}

	@AfterClass
	public void WebDriverClosure() {
		driver.quit();
	}
}
