package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TodoListPage{

	WebDriver driver;
	
	public TodoListPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@name='categorydata']") WebElement AddCategoryTextBox;
	@FindBy(how = How.XPATH, using = "//input[@value='Add category']") WebElement AddCategoryButton;
	@FindBy(how = How.XPATH, using = "//body/a[1]") WebElement ClickYesToAlertButton;
	@FindBy(how = How.XPATH, using = "//input[@value='Remove']") WebElement RemoveButton;
	@FindBy(how = How.XPATH, using = "//select[@name='due_month']") WebElement DueDateDropdown;
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Jan')]") WebElement Jan;
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Feb')]") WebElement Feb;
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Mar')]") WebElement Mar;
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Apr')]") WebElement Apr;
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'May')]") WebElement May;
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Jun')]") WebElement Jun;
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Jul')]") WebElement Jul;
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Aug')]") WebElement Aug;
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Sep')]") WebElement Sep;
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Oct')]") WebElement Oct;
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Nov')]") WebElement Nov;
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Dec')]") WebElement Dec;
	
	public void insertAddCategoryText() {
		
		AddCategoryTextBox.sendKeys("GibranJason123");;
	}
	
	public void clickAddCategoryButton() {
		
		AddCategoryButton.click();
	}
	
	public void clickYesToAlertButton() {
		
		ClickYesToAlertButton.click();
	}
	
	
	public void ClickRemoveButton() {
		
		RemoveButton.click();
	}
	
	public void ClickDueDateDropdown() {
		
		DueDateDropdown.click();
	}
	
	public void ClickJan() {
		
		Jan.click();
	}
	
	public void ClickFeb() {
		
		Feb.click();
	}
	
	public void ClickMar() {
		
		Mar.click();
	}
	
	public void ClickApr() {
		
		Apr.click();
	}
	
	public void ClickMay() {
		
		May.click();
	}
	
	public void ClickJun() {
		
		Jun.click();
	}
	
	public void ClickJul() {
		
		Jul.click();
	}
	
	public void ClickAug() {
		
		Aug.click();
	}
	
	public void ClickSep() {
		
		Sep.click();
	}
	
	public void ClickOct() {
		
		Oct.click();
	}
	
	public void ClickNov() {
		
		Nov.click();
	}
	
	public void ClickDec() {
		
		Dec.click();
	}
}

