package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyPage {
	@FindBy(xpath="//a[@id='buyheading']")
	private WebElement buy;
	
	@FindBy(xpath=".//*[@id='staticSwiperSlider']/div[1]/ul/li[2]/a/span")
	private WebElement housevilla;
	
    @FindBy(xpath=".//*[@id='contactBtn29484823']")
    private WebElement contactbuilder;
    
    @FindBy(xpath="//input[@id='userTypeA29484823']")
    private WebElement agent;
    
    
    @FindBy(xpath=".//*[@id='name29484823']")
    private WebElement name;
    
    @FindBy(xpath=".//*[@id='userMobile29484823']")
    private WebElement mob;
    
    @FindBy(xpath=".//*[@id='userEmail29484823']")
    private WebElement email;
    
    @FindBy(xpath=".//*[@id='propertyCForm29484823']/div/div[2]/ul/li[6]/a")
    private WebElement contact;
    
    
    
    
    
    public BuyPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    
    public void clickonbuy()
    {
    	buy.click();
    	housevilla.click();
    	contactbuilder.click();
    }
    public void fillform(String n1,String no,String id)
    {
    	agent.click();
    	name.sendKeys(n1);
    	mob.sendKeys(no);
    	email.sendKeys(id);
    	contact.click();
    }
}
