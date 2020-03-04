package com.jbk.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.jbk.qa.base.TestBase;

public class ContactsPage extends TestBase {

	public ContactsPage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[text()='Create Contact']")
	WebElement contactsPageLabel;
	
	@FindBy(xpath="//i[@name='ActionMenu' and @value='collapse']")
	WebElement actionsMenu;
	
	
	@FindBy(linkText="Create Contact")
    WebElement createContactBtn;
	
	@FindBy(xpath="//span[text()='Contact Info']")
    WebElement contactInfoLabel;
	
	@FindBy(xpath="//input[@name='Contacts[firstName]' and @class='x2-required']")
    WebElement fName;
	
	@FindBy(xpath="//input[@name='Contacts[lastName]' and @class='x2-required']")
    WebElement lName;
	
	@FindBy(xpath="//input[@name='Contacts[phone]' and @id='Contacts_phone']")
    WebElement phoneNo;
	
	@FindBy(xpath="//div[@class='formInputBox']//following::input[@name='Contacts[email]']")
	WebElement email;
	
	@FindBy(xpath="//span[text()='Sales & Marketing']")
    WebElement sales_and_Marketing;
	
	@FindBy(xpath="//select[@name='Contacts[leadtype]']")
    WebElement leadType;
	
	@FindBy(xpath="//select[@name='Contacts[leadSource]']")
    WebElement leadSource;
	
	@FindBy(xpath="//input[@name='Contacts[leadDate]']")
    WebElement leadDate;
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
    WebElement year;
	
	@FindBy(xpath="//a[@title='Next']")
	WebElement nextBtn;
	
	@FindBy(xpath="//a[@title='Prev']")
	WebElement prevBtn;
	
	@FindBy(xpath="//div[@class='ui-datepicker-title']//span[@class='ui-datepicker-month']")
	WebElement month;
	
	@FindBy(xpath="//table[@class='formSectionColumn']//tr[@id='Contacts_leadscore_field']//div[@role='text']")
	List<WebElement> leadScore;
	
	@FindBy(xpath="//input[@name='Contacts[expectedCloseDate]']")
    WebElement expectedCloseDate;
	
	@FindBy(xpath="//input[@name='Contacts[closedate]']")
    WebElement closeDate;
	
	@FindBy(xpath="//select[@name='Contacts[dealstatus]']")
    WebElement deal_Status;
	
	@FindBy(xpath="//span[text()='Address']")
    WebElement addressSubMenu;
	
	@FindBy(xpath="//input[@name='Contacts[address]']")
    WebElement addr;
	
	@FindBy(xpath="//input[@name='Contacts[city]']")
    WebElement cityName;
	
	@FindBy(xpath="//input[@name='Contacts[state]']")
    WebElement stateName;
	
	@FindBy(xpath="//input[@name='Contacts[zipcode]']")
    WebElement postalCodeNo;
	
	@FindBy(xpath="//input[@name='Contacts[country]']")
    WebElement countryName;
	
	@FindBy(xpath="")
    WebElement backgroundInfo;//i[@class=' fa fa-caret-down']
	
	@FindBy(xpath="//select[@id='Contacts_assignedTo']")
    WebElement assignTo;
	
	@FindBy(xpath="//select[@id='Contacts_priority']")
    WebElement priority;
	
	@FindBy(xpath="//select[@id='Contacts_visibility']")
    WebElement visibility;
	
	@FindBy(xpath="//input[@id='save-button']")
    WebElement createBtn;
	
	public String verifyContactsPageTitle() throws InterruptedException 
	{
		
		return driver.getTitle();
	}
	
	public boolean verifyActionsMenu()
	{
		return actionsMenu.isEnabled();
	}
	
	public boolean verifyCreateContactBtn()
	{
		return createContactBtn.isEnabled();	
	}
	
	public void clickOnCreateContactBtn()
	{
		createContactBtn.click();
	}
	
	public boolean verifyCreateContactLabel()
	{
		return contactsPageLabel.isDisplayed();
	}
	
	public boolean verifyContactInfoLabel()
	{
		return contactInfoLabel.isDisplayed();
	}
	
	public boolean verifySalesAndMarketingMenu()
	{
		return sales_and_Marketing.isEnabled();
	}
	
	public void selectLeadTypeValue()
	{
		Select select = new Select(leadType);
		select.selectByVisibleText("In Person");;
	}
	
	public void selectleadSourceValue()
	{
		Select select = new Select(leadSource);
		select.selectByVisibleText("Google");
	}
	
	public void enterleadDateValue(String mname,String cusdate) throws InterruptedException
	{
		
		
		
		/*JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');",leadDate);
		*/

		/*leadDate.click();
		Select select = new Select(year);
		select.selectByVisibleText("2019");
		
		
		for(int j=0;j<=4;j++)
		{
			String monthName = month.getText();
			System.out.println(monthName);
			
			if(monthName.equals(mname)) 
			{	
				List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td")); 
				
				int total_node = dates.size();
							
				for(int i=0;i<total_node;i++)
				{
					String date = dates.get(i).getText();
					
					if(date.equals(cusdate))
					{
						dates.get(i).click();
						break;
					}
				}
				break;
			}
			else 
			{
				nextBtn.click();
				
			}
			
		}
		*/
		
	//	nextBtn.click();
	/*	List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td")); 
		
		int total_node = dates.size();
		System.out.println(total_node);
		
		for(int i=0;i<total_node;i++)
		{
			String date = dates.get(i).getText();
			
			if(date.equals("21"))
			{
				dates.get(i).click();
				break;
			}
		}*/
		
	}
	
	public void SelectDayFromMultiDateCalendar(String day,String cusyear)
			throws InterruptedException {
		
		//only for current month
		
		leadDate.click();
		
		Select select = new Select(year);
		select.selectByVisibleText(cusyear);

		
		By calendarXpath = By
				.xpath("//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()='"
						+ day + "']");
		driver.findElement(calendarXpath).click();

		// Intentional pause for 2 seconds.
		
	}
	
	public void enterLeadScore(int cusstar) throws InterruptedException
	{
	    	
	//	List<WebElement> star= driver.findElements(By.xpath("//table[@class='formSectionColumn']//tr[@id='Contacts_leadscore_field']//div[@role='text']")); 
		
		int total_node = leadScore.size();
		
		System.out.println(total_node);	
		
		
		for(int i=0;i<cusstar;i++)
		{
			Thread.sleep(2000);
            WebElement element = leadScore.get(i);
			element.click();
		}
        
	}

	public void createContact(String ftname,String ltname,String ph,String ema,String add,String city,String state,String postalCode,String country)
	{
		fName.clear();	
		fName.sendKeys(ftname);
		
		lName.clear();
		lName.sendKeys(ltname);
		
		phoneNo.clear();
		phoneNo.sendKeys(ph);
		
		email.clear();
		email.sendKeys(ema);
		
		addr.clear();
		addr.sendKeys(add);
		
		cityName.clear();
		cityName.sendKeys(city);
		
		stateName.clear();
		stateName.sendKeys(state);
		
		postalCodeNo.clear();
		postalCodeNo.sendKeys(postalCode);
		
		countryName.clear();
		countryName.sendKeys(country);
		
	}

	public void clickcreateBtn()
	{
		createBtn.click();
	}
	
	
	
	
	
}
