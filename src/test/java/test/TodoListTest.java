package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.TodoListPage;
import utils.BrowserFactory;

public class TodoListTest {

	WebDriver driver;
	
	@BeforeClass
	public void initBrowser() {		
		driver = BrowserFactory.init();	
	}	
	
	@Test
	public void testTODOLIST() throws InterruptedException {	
		
		TodoListPage todolistpage = PageFactory.initElements(driver, TodoListPage.class);
		todolistpage.insertAddCategoryText();
		Thread.sleep(2000);
		todolistpage.clickAddCategoryButton();
		Thread.sleep(2000);
		todolistpage.insertAddCategoryText();
		Thread.sleep(2000);
		todolistpage.clickAddCategoryButton();
		Thread.sleep(2000);
		todolistpage.clickYesToAlertButton();
		Thread.sleep(2000);
	
	}
	
	@Test (priority = 1)
	public void testDueDateDropdown() throws InterruptedException {	
		
		TodoListPage todolistpage = PageFactory.initElements(driver, TodoListPage.class);
		todolistpage.ClickDueDateDropdown();
		Thread.sleep(1500);
		todolistpage.ClickJan();
		Thread.sleep(1500);
		todolistpage.ClickFeb();
		Thread.sleep(1500);
		todolistpage.ClickMar();
		Thread.sleep(1500);
		todolistpage.ClickApr();
		Thread.sleep(1500);
		todolistpage.ClickMay();
		Thread.sleep(1500);
		todolistpage.ClickJun();
		Thread.sleep(1500);
		todolistpage.ClickJul();
		Thread.sleep(1500);
		todolistpage.ClickAug();
		Thread.sleep(1500);
		todolistpage.ClickSep();
		Thread.sleep(1500);
		todolistpage.ClickOct();
		Thread.sleep(1500);
		todolistpage.ClickNov();
		Thread.sleep(1500);
		todolistpage.ClickDec();
		Thread.sleep(1500);
	}
	
	@AfterClass
	public void tearDown() {
		BrowserFactory.tearDown();
	}
}
