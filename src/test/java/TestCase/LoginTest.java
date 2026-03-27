package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test
	
	public void LoginTest() {
		LoginPage Lp=new LoginPage(driver);
		Lp.EnterUser("Admin");
		Lp.Enterpass("admin123");
		Lp.Loginclick();
//		Assert.assertEquals(Lp.isLoginSuccessful(),"Dashboard");
		}
	

}
