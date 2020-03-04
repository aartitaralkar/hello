package com.jbk.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jbk.qa.base.TestBase;
import com.jbk.qa.pages.ContactsPage;
import com.jbk.qa.pages.HomePage;
import com.jbk.qa.pages.LoginPage;
import com.jbk.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	TestUtil testUtil;
	String sName = "login";

	public ContactsPageTest() throws IOException {
		super();
	}
	
	@BeforeTest
	public void setUp() throws IOException
	{
		initialization();
		
		loginPage = new LoginPage();
		homePage = new HomePage();
		contactsPage = new ContactsPage();
		testUtil = new TestUtil();
		
		homePage = loginPage.login(properties.getProperty("username"),properties.getProperty("password"));
		
		contactsPage = homePage.clickOnContactsLink();
		
		contactsPage.clickOnCreateContactBtn();
		
	}
	
	@Test(priority=1)
	public void verifyActionsMenuTest()
	{
		Assert.assertTrue(contactsPage.verifyActionsMenu());
	}
	
	@Test(priority=2)
	public void verifyCreateContactBtnTest()
	{
		Assert.assertTrue(contactsPage.verifyCreateContactBtn());
		
	//	contactsPage.clickOnCreateContactBtn();
		
	}
	
	@Test(priority=3)
	public void verifyContactsPageTitleTest() throws InterruptedException
	{
		String title = contactsPage.verifyContactsPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "X2CRM1 - Create Contacts");
	}
	
	@Test(priority=4)
	public void verifyCreateContactLabelTest()
	{
		Assert.assertTrue(contactsPage.verifyCreateContactLabel());
	}
	
	@Test(priority=5)
	public void verifyContactInfoLabelTest()
	{
		Assert.assertTrue(contactsPage.verifyContactInfoLabel());
	}
	
	@DataProvider
	public Object[][] getCRMTestData()
	{
		Object[][] data = TestUtil.getTestData(sName);
		return data;
	}
	
	@Test(priority=10,dataProvider="getCRMTestData")
	public void validateCreateNewContacts(String firstname,String lastname,String phone,String email,String address,String city,String state,String postalCode,String country)  
	{
		
	   contactsPage.createContact(firstname,lastname,phone,email,address,city,state,postalCode,country);
	}
	
	
	@Test(priority=6)
	public void selectLeadTypeValueTest() 
	{
		contactsPage.selectLeadTypeValue();
	}	
	
	@Test(priority=7)
	public void selectleadSourceValueTest() 
	{
		contactsPage.selectleadSourceValue();
	}
	
	@Test(priority=8)
	public void enterleadDateValueTest() throws InterruptedException 
	{
		contactsPage.SelectDayFromMultiDateCalendar("2","2022");
		
		//contactsPage.enterleadDateValue("October","25");
	
		/*String dateVal = "December 23,2019";
	
		contactsPage.enterleadDateValue(dateVal);*/
	}
	
	@Test(priority=9)
	public void enterLeadScoreTest() throws InterruptedException
	{
		contactsPage.enterLeadScore(3);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	/*@Test
	public void clickcreateBtnTest()
	{
		 contactsPage.clickcreateBtn();
	}*/
}

