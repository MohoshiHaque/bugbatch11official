package batch11annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AnnotationProject {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void init() {
		
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
	}

	
	@Test(priority=2)
	public void TestTitle() {
		
		String ExpectedTitle="Swag Labs";
		String ActualTitle= driver.getTitle();
		System.out.println(ActualTitle);
		
	}
	
	@Test(priority=1)
	
	public void TestUrl() {
		
		String ExpectedUrl="https://www.saucedemo.com/";
		String ActualUrl= driver.getCurrentUrl();
		System.out.println(ActualUrl);
		
	}
	
	@AfterTest
	
	public void closewindow() {
		
		driver.quit();
		
	}
	


}
