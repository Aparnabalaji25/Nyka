package scripts;

import org.testng.annotations.Test;

import pom.Signup;

public class SignupTest extends BaseTest {
	@Test
	public void signup() throws InterruptedException
	{
		Signup su=new Signup(driver);
		
		su.getsignup();
	}

}
