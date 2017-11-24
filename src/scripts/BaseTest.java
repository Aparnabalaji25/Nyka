package scripts;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import genrics.MyListners;

@Listeners(MyListners.class)
public class BaseTest implements Autoconst{
	public WebDriver driver;
	public Logger log;
	public BaseTest()
	
	{
		log=Logger.getLogger(this.getClass());
		Logger.getRootLogger().setLevel(org.apache.log4j.Level.INFO);
		
	}
	
	@BeforeMethod
	public void precondition()
	{
      driver=new FirefoxDriver();
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      driver.get("https://www.magicbricks.com/property-for-sale/ALL-RESIDENTIAL-real-estate-Bangalore");
      
      
      
	}
	
	

}
