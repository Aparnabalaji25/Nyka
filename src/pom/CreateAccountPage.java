package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
	
	@FindBy (xpath="//div[@id='navUserName']")
	private WebElement navusername;
	
	@FindBy(xpath=".//*[@id='userLoggedOffLi']/p/span")
	private WebElement signup;
	
	public CreateAccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickdropdown()
	{
		navusername.click();
	}
	
	public void clicksignup()
	{
		signup.click();
	}

}
