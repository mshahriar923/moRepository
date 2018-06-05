package moTestNGPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class MoTestNGClass {
	public String homepageUrl = "http://www.clicksafety.com";
	public String adminURL = "http://stg-portal.clicksafey.com";
	String driverPath = "C:\\Users\\mohammed.shahriar\\chromedriver.exe";
	public WebDriver driver; 
	
	@BeforeTest
	public void launchBrowser(){
		System.out.println("Launching Browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(homepageUrl);
	}
	
  @SuppressWarnings("deprecation")
@Test (priority = 1)
  public void wwwIsUp() {
	  
				//System.setProperty("webdriver.chrome.driver", driverPath);
				//driver = new ChromeDriver();
				//driver.get(homepageUrl);
				String expectedTitle = "OSHA 10-Hour and OSHA 30-Hour Online Safety Training - ClickSafety";
				String actualTitle = driver.getTitle();
				Assert.assertEquals(expectedTitle, actualTitle);
				//driver.close();
  }
  
  @Test (priority = 0, enabled=false)
  public void loginFormLoaded(){
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammed.shahriar\\chromedriver.exe");
	  WebDriver d1 = new ChromeDriver();
	  d1.get("http://stageadmin.clicksafety.com");
	  System.out.println(d1.getTitle());
	  d1.close();
	  }
  
  @AfterTest
  public void terminateBrowser(){
	  driver.close();
  }
	
}
