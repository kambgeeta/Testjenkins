import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testsample {
	
	
	  private WebDriver driver;
	  
	  @Test 
	  public void testEasy() {
	  driver.get("http://demo.guru99.com/test/guru99home/"); 
	  String title =
	  driver.getTitle(); Assert.assertTrue(title.contains("Demo Guru99 Page")); 
	  }
	  
	  @BeforeTest 
	  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Geeta\\Downloads\\chromedriver.exe"); driver = new
	  ChromeDriver(); driver.manage().window().maximize(); 
	  }
	  
	 @AfterTest 
	 public void afterTest() 
	 { 
		 driver.quit();
	 }
	 
	

}
