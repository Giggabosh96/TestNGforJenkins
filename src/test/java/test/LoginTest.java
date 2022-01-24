package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.LoginPage;
import utils.BrowserFactory;

public class LoginTest{

	WebDriver driver;

	@BeforeClass
	public void initializeBrowser() {

		// initialize the browser and navigate to URL

		driver = BrowserFactory.init();
	}
	
	@Test
	public void enterCredentialsAndSignIn() throws InterruptedException {

		// Enter username and password, then click sign in button

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		Thread.sleep(3000);
		loginpage.enterUsername();
		
		Thread.sleep(3000);
		loginpage.enterPassword();
		
		Thread.sleep(3000);
		loginpage.clickSignInButton();

		Assert.assertEquals(driver.getTitle(), "Dashboard- iBilling");
	}
	
	@AfterClass
	public void closeAndQuitBrowser() {
		// quit and close browser

		BrowserFactory.tearDown();
	}

}
