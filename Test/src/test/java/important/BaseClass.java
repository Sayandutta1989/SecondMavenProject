package important;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass {
	public WebDriver driver;
	 
    @Test
	public void setupApplication() 
  {
      
	  String driverPath = "F:\\Java Selenium\\chromedriver_win32\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
      
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      driver.get("https://www.facebook.com/");
  }
}
