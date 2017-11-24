package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup extends BasePage{
	public Signup(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='ubifname']")
	private WebElement name; 
	@FindBy(xpath="//input[@id='ubiemail']")
	private WebElement email; 
	@FindBy(xpath=".//*[@id='ubipass']")
	private WebElement pass;
	@FindBy(xpath=".//*[@id='ubimobile1']")
	private WebElement mob;
	@FindBy(xpath=".//*[@id='signUp']/div/div[7]/div[1]/div[2]/ul/li[2]/span")
	private WebElement agent;
	@FindBy(xpath=".//*[@id='signUp']/div/div[9]/button")
	private WebElement signup;
	public void getsignup() throws InterruptedException
	{
		name.sendKeys("abc");
		Thread.sleep(2000);
		email.sendKeys("aparnabalaji25@gmail.com");
		pass.sendKeys("abc@123");
		mob.sendKeys("8884039792");
		agent.click();
		signup.click();
		//changes done in framework
	}
	
	

}
