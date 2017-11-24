package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {
	public WebDriver driver;
	  public WebElement element ;
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void verifyTitle(String etitle)
	{
		String title=driver.getTitle();
		Assert.assertEquals(title, etitle);
	}
	
	public void waituntilelementvisible()
	
	{  
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	

}
