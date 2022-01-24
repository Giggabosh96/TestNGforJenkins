package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	//This is where we will store interactable methods
	
	@FindBy (how = How.XPATH, using = "//input[@id='username']") WebElement USERNAME;
	@FindBy (how = How.XPATH, using = "//input[@id='password']") WebElement PASSWORD;	
	@FindBy (how = How.XPATH, using = "//button[@type='submit']") WebElement SIGN_IN_BUTTON;
	
	public void enterUsername () {
		USERNAME.sendKeys("demo@techfios.com");
	}
	
	public void enterPassword () {
		PASSWORD.sendKeys("abc123");
	}
	
	public void clickSignInButton () {
		SIGN_IN_BUTTON.click();
	}
	
}
