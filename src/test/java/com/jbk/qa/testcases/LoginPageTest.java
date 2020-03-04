package com.jbk.qa.testcases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.jbk.qa.base.TestBase;
import com.jbk.qa.pages.HomePage;
import com.jbk.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	

	public LoginPageTest() throws IOException {
		super();
	}
	
	@BeforeTest
	public void setUp()  
	{
		initialization();
		try {
			loginPage = new LoginPage();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	@Test()
	public void loginTest() throws IOException
	{
		logger.info("create a homepage");
		homePage = loginPage.login(properties.getProperty("username"),properties.getProperty("password"));
	}
	
	@Test()
	public void loginPageTitleTest()
	{
		
		String title = loginPage.validateLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title,"X2CRM - Login");
	}
    
	@Test()
	public void crmLogoImageTest()
	{
		boolean flag = loginPage.validateCRMImage();
		Assert.assertTrue(flag);
		
	}
	
	/*@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
*/
}
