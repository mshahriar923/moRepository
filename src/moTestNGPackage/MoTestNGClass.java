package moTestNGPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class MoTestNGClass {
	public String homepageUrl = "http://www.clicksafety.com";
	public String adminURL = "http://stageadmin.clicksafey.com"; // updated stageadmin url
	String driverPath = "C:\\Users\\mohammed.shahriar\\chromedriver.exe";
	public WebDriver driver; 
	
	@BeforeTest
	public void launchBrowser()
	{
		System.out.println("Launching Browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
	}
	
  @SuppressWarnings("deprecation")
@Test (priority = 1)
  public void wwwIsUp() 
  {
	  
	  			driver.get(homepageUrl);
	  			String expectedTitle = "OSHA 10-Hour and OSHA 30-Hour Online Safety Training - ClickSafety";
				String actualTitle = driver.getTitle();
				Assert.assertEquals(expectedTitle, actualTitle);
			
  }
  
  @Test (priority = 0, enabled=true)
  public void loginFormLoaded(){
	  driver.get(adminURL);
	  }
  
  @AfterTest
  public void terminateBrowser(){
	  driver.close();
  }
	
}
