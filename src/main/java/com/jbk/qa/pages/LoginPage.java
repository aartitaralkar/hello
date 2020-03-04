package com.jbk.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbk.qa.base.TestBase;

public class LoginPage extends TestBase{

	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="LoginForm_username")
	WebElement userName;
	
	@FindBy(id="LoginForm_password")
	WebElement password;
	
	@FindBy(id="signin-button")
	WebElement signUpBtn;
	
	@FindBy(xpath="//span[@id='login-form-logo']")
	WebElement crmLogo;
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateCRMImage()
	{
		return crmLogo.isDisplayed();
	}
	
	public HomePage login(String uname,String pwd) throws IOException
	{
		userName.sendKeys(uname);
		password.sendKeys(pwd);
		signUpBtn.click();
		return new HomePage();
	}
}
