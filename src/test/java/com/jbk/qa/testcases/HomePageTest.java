package com.jbk.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.jbk.qa.base.TestBase;
import com.jbk.qa.pages.AccountsPage;
import com.jbk.qa.pages.ActionPage;
import com.jbk.qa.pages.ActiveUserPage;
import com.jbk.qa.pages.ActivityPage;
import com.jbk.qa.pages.ContactsPage;
import com.jbk.qa.pages.EmailPage;
import com.jbk.qa.pages.HomePage;
import com.jbk.qa.pages.LoginPage;
import com.jbk.qa.pages.MarketingPage;
import com.jbk.qa.pages.OpportunitiesPage;
import com.jbk.qa.pages.ProfilePage;
import com.jbk.qa.pages.ServicePage;
import com.jbk.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	EmailPage emailPage;
	LoginPage loginPage;
	HomePage homePage;
	ActivityPage activityPage;
	ContactsPage contactsPage;
	AccountsPage accountsPage;
	MarketingPage marketingPage;
	OpportunitiesPage opportunitiesPage;
	ServicePage servicePage;
	ActionPage actionPage;
	ProfilePage profilePage;
	ActiveUserPage activeUserPage;
	TestUtil testUtil;

	public HomePageTest() throws IOException {
		super(); 
	}
	
	@BeforeTest
	public void setUp() throws IOException
	{
		initialization();
		
		loginPage = new LoginPage();
	//	activityPage = new ActivityPage();
		contactsPage = new ContactsPage();
		testUtil = new TestUtil();
	//	accountsPage = new AccountsPage();
	//	marketingPage = new MarketingPage();
	//	opportunitiesPage = new OpportunitiesPage();
	//	servicePage = new ServicePage();
	//	actionPage = new ActionPage();
	//	profilePage = new ProfilePage();
	//	activeUserPage = new ActiveUserPage();
	//	emailPage = new EmailPage();
		
		homePage = loginPage.login(properties.getProperty("username"),properties.getProperty("password"));
	}
	
	@Test(priority=2)
	public void verifyHomePageTitleTest() throws InterruptedException
	{
		String homePagetitle = homePage.verifyHomePageTitle();
		System.out.println(homePagetitle);
		Assert.assertEquals(homePagetitle, "X2CRM1 - View Profile");
	}
	
	@Test(priority=1)
	public void verifyActiveUserNameTest()
	{
		Assert.assertTrue(homePage.verifyActiveUserName());
	}
	
	/*@Test(priority=3)
	public void verifyActivityLinkTest() throws IOException
	{
		activityPage = homePage.clickOnActivityLink();
	}*/
	
	@Test(priority=3)
	public void verifyContactsLinkTest() throws IOException
	{
		contactsPage = homePage.clickOnContactsLink();
	}
	
	/*@Test(priority=5)
	public void verifyAccountsLinkTest()
	{
		accountsPage = homePage.clickOnAccountsLink();
	}
	
	@Test(priority=6)
	public void verifyMarketingLinkTest()
	{
		marketingPage = homePage.clickOnMarketingLink();		
	}
	
	@Test(priority=7)
	public void verifyOpportunitiesLinkTest()
	{
		opportunitiesPage = homePage.clickOnOpportunitiesLink();
	}
	
	@Test(priority=8)
	public void verifyServiceLinkTest()
	{
		servicePage = homePage.clickOnServiceLink();
	}
	
	@Test(priority=9)
	public void verifyActionLinkTest()
	{
		actionPage = homePage.clickOnActionLink();
	}
	
	@Test(priority=10)
	public void verifyProfileLinkTest()
	{
		profilePage = homePage.clickOnProfileLink();
	}
	
	@Test(priority=1)
	public void verifyMoreLinkTest() throws InterruptedException
	{
		emailPage = homePage.clickOnMoreLink();
	}
	
	@Test(priority=12)
	public void verifyActiveUserLinkTest()
	{
		
	}
	*/
	
	/*@AfterTest
	public void tearDown()
	{
		driver.quit();
	}*/
}
