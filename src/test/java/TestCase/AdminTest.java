package TestCase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.AdminPage;
import PageObject.DashboadPage;
import PageObject.LoginPage;

public class AdminTest extends BaseTest {
	
	@BeforeMethod
	public void beforetest() {
		LoginPage Lp=new LoginPage(driver);
		DashboadPage Dsh= new DashboadPage(driver);
		Lp.EnterUser("Admin");
		Lp.Enterpass("admin123");
		Lp.Loginclick();
		Dsh.clickAdmin();
		
		
		
//		AdminPage userpage = new AdminPage(driver);
	}
	
	
	@Test
	public void AdminTest() {
		AdminPage userpage = new AdminPage(driver);
	    userpage.SetUsername("Admin");
		userpage.Setuserrol("Admin");
		userpage.setStatus("Enabled");
		userpage.Searchbtn();
		
		
		}
	

}
