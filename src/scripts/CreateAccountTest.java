package scripts;



import org.testng.annotations.Test;

import pom.BasePage;
import pom.CreateAccountPage;

public class CreateAccountTest extends BaseTest
{
	@Test
	public void test() throws InterruptedException
	{
		 CreateAccountPage cp=new CreateAccountPage(driver);
		 cp.clickdropdown();
		 
		 cp.clicksignup();
		 BasePage bp=new BasePage(driver);
		 bp.waituntilelementvisible();
	}

}
