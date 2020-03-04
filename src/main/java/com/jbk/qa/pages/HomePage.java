package com.jbk.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbk.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(linkText="John Peter")
	WebElement userNameLabel;
	
	@FindBy(linkText="Activity")
	WebElement activityLink;
	
	@FindBy(linkText="Contacts")
	WebElement contactsLink;
	
	@FindBy(linkText="Accounts")
	WebElement accountsLink;
	
	@FindBy(linkText="Marketing")
	WebElement marketingLink;
	
	@FindBy(linkText="Opportunities")
	WebElement opportunitiesLink;
	
	@FindBy(linkText="Service")
	WebElement serviceLink;
	
	@FindBy(linkText="Actions")
	WebElement actionLink;
	
	@FindBy(xpath="//span[text()='More']")
	WebElement moreLink;
	
	@FindBy(xpath="//*[@id=\"more-menu\"]/ul/li[10]/a")
	WebElement email;
	
	@FindBy(linkText="Profile")
	WebElement profileLink;
	
	@FindBy(xpath="//li[@id='profile-dropdown']")
	WebElement activeUserLink;
	
	public HomePage() throws IOException {
		
		PageFactory.initElements(driver,this);
	}
	
	public String verifyHomePageTitle() throws InterruptedException
	{
		Thread.sleep(2000);
		return driver.getTitle();
	}
	
	public boolean verifyActiveUserName()
	{
		return userNameLabel.isDisplayed();
	}
	
	/*public ActivityPage clickOnActivityLink() throws IOException
	{
		activityLink.click();
		return new ActivityPage();
	}*/
	
	public ContactsPage clickOnContactsLink() throws IOException {
			
		    contactsLink.click();
			return new ContactsPage();
		}
	
	/*public ContactsPage clickOnNewContactsLink() throws IOException {
		
	    contactsLink.click();
		return new ContactsPage();
	}*/
		
	
	/*public AccountsPage clickOnAccountsLink()
	{
		accountsLink.click();
		return new AccountsPage();
		
	}
	
	public MarketingPage clickOnMarketingLink()
	{
		marketingLink.click();
		return new MarketingPage();
	}
	
	public OpportunitiesPage clickOnOpportunitiesLink()
	{
		opportunitiesLink.click();
		return new OpportunitiesPage();
	}
	
	public ServicePage clickOnServiceLink()
	{
		serviceLink.click();
		return new ServicePage();
	}
	
	public ActionPage clickOnActionLink()
	{
		actionLink.click();
		return new ActionPage();
	}
	
	public ProfilePage clickOnProfileLink()
	{
		profileLink.click();
		return new ProfilePage();
	}
	
	public EmailPage clickOnMoreLink() throws InterruptedException
	{
		moreLink.click();
		Actions action = new Actions(driver);
		action.moveToElement(email).build().perform();
		email.click();
		return new EmailPage();
	}
	
	public ActiveUserPage clickOnActiveUserLink()
	{
		activeUserLink.click();
		return new ActiveUserPage();
	}
	
	*/
}
