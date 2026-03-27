package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends BasePage {

	public AdminPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	
	@FindBy(xpath="//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	WebElement Username1;
	
	@FindBy(xpath="//div[contains(text(),'-- Select --')])[1]")
	WebElement UserRole;
	
	@FindBy(xpath="//div[@role='listbox']//span")
	WebElement userRoleOptions;
	
	@FindBy(xpath="(//input[@placeholder='Type for hints...'])[1]")
	WebElement UserEmployeeName;
	
	@FindBy(xpath="(//div[@class='oxd-select-text--after'])[2]")
	WebElement Status;
	
	@FindBy(xpath="//button[normalize-space()='Search']")
	WebElement SearchBtn;
	
	@FindBy(xpath="//button[normalize-space()='Reset']")
	WebElement Resetbtn;
	@FindBy(xpath="//div[@role='listbox']//span")
	WebElement Statusoption;
	
	
	
	public void SetUsername(String username) {
		Username1.clear();
		Username1.sendKeys(username);
		
	}
	public void Setuserrol(String roletext) {
		UserRole.click();
		
		List<WebElement> opts = driver.findElements((By) userRoleOptions);
		
            for(WebElement opt:opts) {
			if(opt.getText().trim().equals(roletext)) {
			opt.click();
			break;
			}
		}
         }
	  public void setStatus(String statusText) {
		  Status.click();
		  List<WebElement> st=driver.findElements((By) Statusoption);
	    	for(WebElement status:st) {
	    		if(status.getText().trim().equals(statusText)) {
	    			status.click();
	    		}
	    	} 
	     }
	  
	  public void Searchbtn() {
		  SearchBtn.click();
		  
	  }
	  public void Resetbtn() {
		  Resetbtn.click();
		  
	  }
	
	
	
	
	
	
	

	
}
