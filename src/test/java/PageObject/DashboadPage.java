package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboadPage extends BasePage {

	public DashboadPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//a[@class='oxd-main-menu-item active']")
	WebElement AdminClick;

	public void clickAdmin() {
		AdminClick.click();
		
	}
}
