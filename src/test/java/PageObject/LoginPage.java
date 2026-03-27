package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver){
		super(driver);
		
		}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement Username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement LogInbtn;
	
	
	public void EnterUser(String username ) {
		Username.sendKeys(username);
		
	}
	
   public void Enterpass(String pwd) {
	   password.sendKeys(pwd);
		
	}
   public void Loginclick() {
	   LogInbtn.click();
	}
   
   public boolean isLoginSuccessful() {
	// after login, dashboard has element with text "Dashboard" - adjust if needed
	try {
	WebElement dash = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
	return dash.isDisplayed();
	} catch (Exception e) {
	return false;
	}
	}
   


	

}
